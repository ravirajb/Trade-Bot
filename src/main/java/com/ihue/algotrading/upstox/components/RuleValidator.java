package com.ihue.algotrading.upstox.components;

import com.ihue.algotrading.upstox.dao.StocksDAO;
import com.ihue.algotrading.upstox.model.Datum;
import com.ihue.algotrading.upstox.model.OneMinAggregateDatum;
import com.ihue.algotrading.upstox.model.TradeVals;
import com.upstox.marketdatafeeder.rpc.proto.Upstox;
import lombok.extern.log4j.Log4j2;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static com.ihue.algotrading.utils.Constants.*;
import static com.ihue.algotrading.utils.Utilities.buildMap;
import static com.ihue.algotrading.utils.Utilities.getEma;

@Component
@Log4j2
public class RuleValidator {
    @Autowired
    private StocksDAO stocksDAO;

    public void validate() {
        List<Upstox.LTPC> datumList = stocksDAO.getTrades();
        log.info("size:{}", datumList.size());

        String key = "NSE_FO|53951";

        datumList.forEach(ltpc -> {
            OneMinAggregateDatum oneMinAggregateDatum = buildMap(ltpc, key);

            if (!values.containsKey(key)) {
                values.put(key, TradeVals.builder().build());
            }
            TradeVals vals = values.get(key);

            // log.info("map: {}", dataMap.get(key).keySet());
            if (dataMap.get(key).keySet().size() > 6) {
                double current2EmaHigh = getEma(2, "H", key, oneMinAggregateDatum);
                double current3EmaLow = getEma(3,  "L", key, oneMinAggregateDatum);
                double current5EmaLow = getEma(7,  "L", key, oneMinAggregateDatum);
                double current3EmaHigh = getEma(3, "H", key, oneMinAggregateDatum);

                if (current3EmaLow > current5EmaLow && !vals.isTradeBooked() && (ltpc.getLtp() - current3EmaLow) < 1) {
                    // log.info("2EMAH:{}, 3EMAL:{}, 5EMAL: {}, 3EMAH: {} ", current2EmaHigh, current3EmaLow, current5EmaLow, current3EmaHigh);
                    vals.setTradeBookPrice(ltpc.getLtp());
                    vals.setTradeBooked(true);
                }
                if (vals.isTradeBooked() && (current2EmaHigh - current3EmaHigh) < 1 && (current2EmaHigh - current3EmaHigh) > 0) {
                    if (ltpc.getLtp() - vals.getTradeBookPrice() != 0) {
                        log.info("2EMAH:{}, 3EMAL:{}, 5EMAL: {}, 3EMAH: {}, PNL:{}",
                                current2EmaHigh, current3EmaLow, current5EmaLow, current3EmaHigh,
                                ltpc.getLtp() - vals.getTradeBookPrice());
                    }

                    vals.setTradeBooked(false);
                    vals.setTradeBookPrice(0);
                }
            }
        });

        System.exit(0);
    }
}
