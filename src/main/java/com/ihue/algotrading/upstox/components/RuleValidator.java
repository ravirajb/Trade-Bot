package com.ihue.algotrading.upstox.components;

import com.ihue.algotrading.upstox.dao.StocksDAO;
import com.ihue.algotrading.upstox.model.OneMinAggregateDatum;
import com.ihue.algotrading.upstox.model.TradeVals;
import com.upstox.marketdatafeeder.rpc.proto.Upstox;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
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
        double totalPnl = 0;
        List<Upstox.LTPC> datumList = stocksDAO.getTrades();
        log.info("size:{}", datumList.size());

        String key = "NSE_FO|53951";

        for (Upstox.LTPC ltpc : datumList) {
            OneMinAggregateDatum oneMinAggregateDatum = buildMap(ltpc, key);

            if (!values.containsKey(key)) {
                values.put(key, TradeVals.builder().build());
            }

            TradeVals vals = values.get(key);

            if (dataMap.get(key) != null && dataMap.get(key).size() > 21) {
                double current2EmaHigh = getEma(2, "H", key, oneMinAggregateDatum);
                double current3EmaLow = getEma(3, "L", key, oneMinAggregateDatum);
                double current5EmaLow = getEma(5, "L", key, oneMinAggregateDatum);
                double current3EmaHigh = getEma(3, "H", key, oneMinAggregateDatum);
                double current7EmaLow = getEma(7, "L", key, oneMinAggregateDatum);
                double current21EmaLow = getEma(21, "L", key, oneMinAggregateDatum);
                double current84EmaLow = getEma(84, "L", key, oneMinAggregateDatum);
                //if (vals.isTradeBooked()) {

                    System.out.println(ltpc.getLtp()
                            + "~" + current5EmaLow
                            + "~" + current7EmaLow
                            + "~" + current21EmaLow
                            + "~" + current84EmaLow
                            + "~" + current2EmaHigh
                            + "~" + current3EmaHigh
                            + "~" + Instant.ofEpochMilli(oneMinAggregateDatum.getOneMinTimeTraded())
                            );
                //}

                /*if (current5EmaLow > current7EmaLow
                        && current7EmaLow > current21EmaLow
                        && current21EmaLow > current84EmaLow
                        && !vals.isTradeBooked()
                        && (current5EmaLow - current7EmaLow) < 1
                        && (ltpc.getLtp() - current5EmaLow) < 1
                ) {
                    System.out.println("BookPrice:" + ltpc.getLtp()
                            + ":5EMA:" + current5EmaLow
                            + ":7EMA:" + current7EmaLow
                            + ":21EMA:" + current21EmaLow
                            + ":2EMAH:" + current2EmaHigh
                            + ":3EMAH:" + current3EmaHigh
                            + ":TradedMinute:" + vals.getLastTradedMinute()
                    );
                    vals.setTradeBookPrice(ltpc.getLtp());
                    vals.setTradeBooked(true);
                    vals.setLastTradedTime(ltpc.getLtt());
                    vals.setLastTradedMinute(oneMinAggregateDatum.getOneMinTimeTraded());
                    vals.setCoolingPeriod(1);
                } else if (vals.isTradeBooked()
                        && current7EmaLow > current21EmaLow
                        && current21EmaLow > current84EmaLow
                        && ltpc.getLtt() > vals.getLastTradedMinute()
                        && current2EmaHigh < current3EmaHigh) {
                    System.out.println("ExitPrice" + ltpc.getLtp()
                            + ":PNL:" + (ltpc.getLtp() - vals.getTradeBookPrice())
                            + ":5EMA:" + current5EmaLow
                            + ":7EMA:" + current7EmaLow
                            + ":21EMA:" + current21EmaLow
                            + ":2EMAH:" + current2EmaHigh
                            + ":3EMAH:" + current3EmaHigh
                            + ":exitMinute:" + oneMinAggregateDatum.getOneMinTimeTraded()
                    );
                    totalPnl = totalPnl + (ltpc.getLtp() - vals.getTradeBookPrice());
                    vals.setTradeBooked(false);
                    vals.setTradeBookPrice(0);
                    vals.setCoolingPeriod(0);
                }*/
            }
        }

        System.out.println(totalPnl);
        System.exit(0);
    }
}
