package com.ihue.algotrading.upstox.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Datum {
    private String scripName;
    private Float lastTradedPrice;
    private Integer lastTradedQuantity;
    private Long lastTradedTime;
}
