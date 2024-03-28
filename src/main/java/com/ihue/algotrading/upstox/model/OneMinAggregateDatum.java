package com.ihue.algotrading.upstox.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OneMinAggregateDatum {
    private String scripName;
    private long totalQuantityTraded;
    private double close;
    private double open;
    private double high;
    private double low;
    private boolean doji;
    private boolean bearish;
    private double priceVolume;
    private List<Long> consolidatedTimeStamps;
    private Long oneMinTimeTraded;
}
