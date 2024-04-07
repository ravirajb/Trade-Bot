package com.ihue.algotrading.upstox.model;

import lombok.Data;

import java.util.List;

@Data
public class CandleResponse {
    private List<List<String>> candles;
}