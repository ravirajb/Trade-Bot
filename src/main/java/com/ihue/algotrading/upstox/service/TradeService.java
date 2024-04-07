package com.ihue.algotrading.upstox.service;

import com.ihue.algotrading.upstox.dao.StocksDAO;
import com.ihue.algotrading.upstox.model.OneMinAggregateDatum;
import com.ihue.algotrading.upstox.model.TradeVals;
import com.upstox.marketdatafeeder.rpc.proto.Upstox;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.ihue.algotrading.utils.Constants.dataMap;
import static com.ihue.algotrading.utils.Constants.values;
import static com.ihue.algotrading.utils.Utilities.buildMap;
import static com.ihue.algotrading.utils.Utilities.getEma;

@Service
@Log4j2
public class TradeService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private StocksDAO stocksDAO;

    public void doTrades(Upstox.FeedResponse feedResponse) {
        feedResponse.getFeedsMap()
                .keySet()
                .parallelStream()
                .forEach(key -> {
                    Upstox.LTPC ltpc = feedResponse.getFeedsMap()
                            .get(key)
                            .getFf()
                            .getMarketFF()
                            .getLtpc();

                    //stocksDAO.insertStock(ltpc, key);

                    OneMinAggregateDatum oneMinAggregateDatum = buildMap(ltpc, key);

                    if (!values.containsKey(key)) {
                        values.put(key, TradeVals.builder().build());
                    }

                    TradeVals vals = values.get(key);

                    if (dataMap.get(key) != null && dataMap.get(key).size() > 6) {
                        double current2EmaHigh = getEma(2, "H", key);
                        double current3EmaLow = getEma(3, "L", key);
                        double current5EmaLow = getEma(5, "L", key);
                        double current3EmaHigh = getEma(3, "H", key);

                        if (!vals.isTradeBooked()
                                && current3EmaLow > current5EmaLow
                                && ltpc.getLtp() - current3EmaLow < 1)
                        {
                            System.out.println("Entry-At:" + ltpc.getLtp());
                            vals.setTradeBookPrice(ltpc.getLtp());
                            vals.setTradeBooked(true);
                            vals.setLastTradedTime(ltpc.getLtt());
                            vals.setLastTradedMinute(oneMinAggregateDatum.getOneMinTimeTraded());
                            vals.setCoolingPeriod(1);
                        } else if (vals.isTradeBooked()
                                && oneMinAggregateDatum.getOneMinTimeTraded() > vals.getLastTradedMinute()
                                && current2EmaHigh < current3EmaHigh)
                        {
                            System.out.println("Exit-At:" + ltpc.getLtp());
                            vals.setTradeBooked(false);
                            vals.setTradeBookPrice(0);
                            vals.setLastTradedTime(0);
                            vals.setLastTradedMinute(0);
                            vals.setCoolingPeriod(0);
                        }


                        /*if (current3EmaLow > current5EmaLow && !vals.isTradeBooked() && (ltpc.getLtp() - current3EmaLow) < 1) {
                            vals.setTradeBookPrice(ltpc.getLtp());
                            vals.setTradeBooked(true);
                            vals.setLastTradedTime(ltpc.getLtt());
                            vals.setCoolingPeriod(1);
                        } else if (vals.isTradeBooked() && (current2EmaHigh - current3EmaHigh) < 1 && ltpc.getLtt() > vals.getLastTradedTime()
                                && vals.getCoolingPeriod() < 7) {
                            vals.setCoolingPeriod(vals.getCoolingPeriod() + 1);
                        }
                        if (vals.isTradeBooked()
                                && (current2EmaHigh - current3EmaHigh) < 1
                                && ltpc.getLtt() > vals.getLastTradedTime()
                                && vals.getCoolingPeriod() >= 7) {
                            log.info("Traded for: Scrip: {}, tradeBookPrice: {}. exitPrice: {}, PNL:{}",
                                    key,
                                    vals.getTradeBookPrice(),
                                    ltpc.getLtp(),
                                    ltpc.getLtp() - vals.getTradeBookPrice());
                            vals.setTradeBooked(false);
                            vals.setTradeBookPrice(0);
                            vals.setCoolingPeriod(0);
                        }*/
                    }
                });
    }
}
