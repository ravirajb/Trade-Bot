package com.ihue.algotrading.upstox.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
@Builder
public class TradeVals {
    private double threeEma = 0;
    private double fiveEma = 0;
    private double twoEma = 0;
    private double twoEmaH = 0;
    private double threeEmaH = 0;
    private boolean tradeBooked = false;
    private double tradeBookPrice = 0;
    private long lastTradedTime;
    private long lastTradedMinute;
    private int coolingPeriod;
    private List<String> buyOrders = Collections.EMPTY_LIST;
    private List<String> sellOrders = Collections.EMPTY_LIST;
}
