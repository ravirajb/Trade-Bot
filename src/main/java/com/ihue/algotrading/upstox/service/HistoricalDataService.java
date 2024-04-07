package com.ihue.algotrading.upstox.service;

import com.ihue.algotrading.upstox.model.HistoricalCandleResponse;
import com.ihue.algotrading.upstox.model.OneMinCandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoricalDataService {

    @Autowired
    private WebClient webClient;

    @Value("${upstox.api.token}")
    private String apiToken;

    public void populateHistoricalData(String key) {
        List<OneMinCandle> oneMinCandleList = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        webClient.get()
                .uri("historical-candle/{instrumentKey}/{interval}/{to_date}/{from_date}",
                        key, "1minute", "2024-04-05", "2024-01-01")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + apiToken)
                .retrieve()
                .bodyToMono(HistoricalCandleResponse.class)
                .map(elem -> {
                    elem.getData().getCandles()
                            .forEach(candle -> {
                                try {
                                    OneMinCandle oneMinCandle
                                            = OneMinCandle.builder()
                                            .timeStamp((formatter.parse(candle.get(0))))
                                            .open(Double.parseDouble(candle.get(1)))
                                            .high(Double.parseDouble(candle.get(2)))
                                            .low(Double.parseDouble(candle.get(3)))
                                            .close(Double.parseDouble(candle.get(4)))
                                            .build();
                                    oneMinCandleList.add(oneMinCandle);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            });
                    return oneMinCandleList;
                })
                .block();
    }
}
