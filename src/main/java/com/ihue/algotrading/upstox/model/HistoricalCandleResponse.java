package com.ihue.algotrading.upstox.model;

import lombok.Data;

import java.util.List;

@Data
public class HistoricalCandleResponse {
    private String status;
    private CandleResponse data;
}

