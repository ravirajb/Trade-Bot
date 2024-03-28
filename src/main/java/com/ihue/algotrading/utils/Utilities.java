package com.ihue.algotrading.utils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.ihue.algotrading.upstox.model.Instrument;
import com.ihue.algotrading.upstox.model.OneMinAggregateDatum;
import com.ihue.algotrading.upstox.model.TradeVals;
import com.upstox.marketdatafeeder.rpc.proto.Upstox;

import java.io.*;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.zip.GZIPInputStream;

import static com.ihue.algotrading.data.InMemoryDatum.INSTRUMENT_CACHE;
import static com.ihue.algotrading.utils.Constants.*;

public class Utilities {

    public static void unzipAndUse(Path sourcePath, Path targetPath) throws IOException {
        try (GZIPInputStream gis = new GZIPInputStream(
                new FileInputStream(sourcePath.toFile()));
             FileOutputStream fos = new FileOutputStream(targetPath.toFile())) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = gis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        }
    }

    public static void readCSV(String filename) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        List<Instrument> instruments = new ArrayList<>();

        ObjectReader oReader = csvMapper.readerWithSchemaFor(Instrument.class).with(schema);
        try (Reader reader = new FileReader(filename)) {
            MappingIterator<Instrument> mi = oReader.readValues(reader);
            while (mi.hasNext()) {
                instruments.add(mi.nextValue());
            }
        }
        INSTRUMENT_CACHE.put(INSTRUMENTS, instruments);
    }

    public static void generateMinuteMap() {
        for (int hour=9; hour < 16; hour++) {
            for (int minute=0; minute<60; minute++) {

            }
        }
    }

    public static OneMinAggregateDatum buildMap(Upstox.LTPC datum, String key) {
        Instant time = Instant.ofEpochMilli(datum.getLtt());
        OneMinAggregateDatum oneMinDatum;

        LocalDateTime localDateTime =
                LocalDateTime.ofInstant(time, IST_ZID);

        Long oneMinTradedTime = localDateTime
                .truncatedTo(ChronoUnit.MINUTES)
                .plusMinutes(1)
                .atZone(IST_ZID)
                .toInstant()
                .toEpochMilli();

        if (dataMap.containsKey(key)) {
            if (dataMap.get(key).containsKey(oneMinTradedTime)) {
                // Post the first find & data present for minute window
                oneMinDatum = dataMap.get(key).get(oneMinTradedTime);

                oneMinDatum.setOneMinTimeTraded(oneMinTradedTime);

                oneMinDatum.setHigh(datum.getLtp() > oneMinDatum.getHigh() ?
                        datum.getLtp() :
                        oneMinDatum.getHigh());

                oneMinDatum.setLow(datum.getLtp() < oneMinDatum.getLow() ?
                        datum.getLtp() :
                        oneMinDatum.getLow());

                oneMinDatum.setClose(datum.getLtp());

                oneMinDatum.setTotalQuantityTraded(oneMinDatum.getTotalQuantityTraded()
                        + datum.getLtq());

                oneMinDatum.setPriceVolume(oneMinDatum.getPriceVolume()
                        + datum.getLtq() * datum.getLtp());

                oneMinDatum.setTotalQuantityTraded(oneMinDatum.getTotalQuantityTraded()
                        + datum.getLtq());

                oneMinDatum.getConsolidatedTimeStamps()
                        .add(datum.getLtt());

                oneMinDatum.setBearish(oneMinDatum.getOpen() < oneMinDatum.getClose());

                oneMinDatum.setDoji(oneMinDatum.getOpen() / oneMinDatum.getClose() < 0.1
                        || oneMinDatum.getClose() / oneMinDatum.getOpen() < 0.1);
            } else {
                List<Long> consolidatedTS = new ArrayList<>();
                consolidatedTS.add(datum.getLtt());
                Map<Long, OneMinAggregateDatum> newMap = new HashMap<>();
                oneMinDatum = OneMinAggregateDatum.builder()
                        .scripName(key)
                        .low(datum.getLtp())
                        .high(datum.getLtp())
                        .open(datum.getLtp())
                        .close(datum.getLtp())
                        .totalQuantityTraded(datum.getLtq())
                        .priceVolume(datum.getLtq() * datum.getLtp())
                        .bearish(false)
                        .doji(false)
                        .consolidatedTimeStamps(consolidatedTS)
                        .oneMinTimeTraded(oneMinTradedTime)
                        .build();

                Map<Long, OneMinAggregateDatum> map = dataMap.get(key);
                map.put(oneMinTradedTime, oneMinDatum);
            }
        } else {
            List<Long> consolidatedTS = new ArrayList<>();
            consolidatedTS.add(datum.getLtt());
            Map<Long, OneMinAggregateDatum> newMap = new HashMap<>();

            oneMinDatum = OneMinAggregateDatum.builder()
                    .scripName(key)
                    .low(datum.getLtp())
                    .high(datum.getLtp())
                    .open(datum.getLtp())
                    .close(datum.getLtp())
                    .totalQuantityTraded(datum.getLtq())
                    .priceVolume(datum.getLtq() * datum.getLtp())
                    .bearish(false)
                    .doji(false)
                    .consolidatedTimeStamps(consolidatedTS)
                    .oneMinTimeTraded(oneMinTradedTime)
                    .build();

            newMap.put(oneMinTradedTime, oneMinDatum);
            dataMap.put(key, newMap);
        }
        return oneMinDatum;
    }

    public static double getEma(int period, String indicator, String key, OneMinAggregateDatum oneMinAggregateDatum) {
        double periodEma = 0;
        double multiplier = (double) 2 / (period + 1);
        TradeVals vals = values.get(key);
        SortedSet<Long> sortedKeys = new TreeSet<>(dataMap.get(key).keySet())
                .descendingSet();
        switch (period) {
            case 2:
                if (vals.getTwoEma() == 0) {
                    double sum = 0d;
                    int lc = 0;
                    for (Long sortedKey : sortedKeys) {
                        if (indicator.equals("L")) {
                            sum = sum + dataMap.get(key).get(sortedKey).getClose();
                        } else{
                            sum = sum + dataMap.get(key).get(sortedKey).getHigh();
                        }
                        lc++;
                        if (lc > 1) break;
                    }
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - sum / 2) * multiplier) + sum / 2;
                    } else {
                        periodEma = (((oneMinAggregateDatum.getHigh()) - sum / 2) * multiplier) + sum / 2;
                    }

                } else {
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - vals.getTwoEma()) * multiplier) + vals.getTwoEma();
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - vals.getTwoEmaH()) * multiplier) + vals.getTwoEmaH();
                    }
                }
                if (indicator.equals("L")) {
                    vals.setTwoEma(periodEma);
                } else {
                    vals.setTwoEmaH(periodEma);
                }
                return periodEma;
            case 3:
                if (vals.getThreeEma() == 0) {
                    double sum = 0;
                    int lc = 0;
                    for (Long sortedKey : sortedKeys) {
                        if (indicator.equals("L")) {
                            sum = sum + dataMap.get(key).get(sortedKey).getClose();
                        } else{
                            sum = sum + dataMap.get(key).get(sortedKey).getHigh();
                        }
                        lc++;
                        if (lc > 2) break;
                    }
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - sum / 3) * multiplier) + sum / 3;
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - sum / 3) * multiplier) + sum / 3;
                    }

                } else {
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - vals.getThreeEma()) * multiplier) + vals.getThreeEma();
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - vals.getThreeEmaH()) * multiplier) + vals.getThreeEmaH();
                    }

                }
                if (indicator.equals("L")) {
                    vals.setThreeEma(periodEma);
                } else {
                    vals.setThreeEmaH(periodEma);
                }

                return periodEma;
            case 5:
                if (vals.getFiveEma() == 0) {
                    double sum = 0;
                    int lc = 0;
                    for (Long sortedKey : sortedKeys) {
                        if (indicator.equals("L")) {
                            sum = sum + dataMap.get(key).get(sortedKey).getClose();
                        } else{
                            sum = sum + dataMap.get(key).get(sortedKey).getHigh();
                        }
                        lc++;
                        if (lc > 4) break;
                    }
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - sum / 5) * multiplier) + sum / 5;
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - sum / 5) * multiplier) + sum / 5;
                    }
                } else {
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - vals.getFiveEma()) * multiplier) + vals.getFiveEma();
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - vals.getFiveEma()) * multiplier) + vals.getFiveEma();
                    }
                }
                vals.setFiveEma(periodEma);
                return periodEma;
            case 7:
                if (vals.getFiveEma() == 0) {
                    double sum = 0;
                    int lc = 0;
                    for (Long sortedKey : sortedKeys) {
                        if (indicator.equals("L")) {
                            sum = sum + dataMap.get(key).get(sortedKey).getClose();
                        } else{
                            sum = sum + dataMap.get(key).get(sortedKey).getHigh();
                        }
                        lc++;
                        if (lc > 6) break;
                    }
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - sum / 7) * multiplier) + sum / 7;
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - sum / 7) * multiplier) + sum / 7;
                    }
                } else {
                    if (indicator.equals("L")) {
                        periodEma = ((oneMinAggregateDatum.getClose() - vals.getFiveEma()) * multiplier) + vals.getFiveEma();
                    } else {
                        periodEma = ((oneMinAggregateDatum.getHigh() - vals.getFiveEma()) * multiplier) + vals.getFiveEma();
                    }
                }
                vals.setFiveEma(periodEma);
                return periodEma;
            default:
                return 0;
        }
    }
}
