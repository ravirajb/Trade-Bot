package com.ihue.algotrading.upstox.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class OneMinCandle {
    private Date timeStamp;
    private double open;
    private double close;
    private double high;
    private double low;
    private long volume;
    private double openInterest;
}
