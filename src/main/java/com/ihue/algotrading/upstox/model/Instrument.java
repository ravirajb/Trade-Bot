package com.ihue.algotrading.upstox.model;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Instrument {
    @JsonProperty("instrument_key")
    private String instrumentKey;

    @JsonProperty("exchange_token")
    private int exchangeToken;

    @JsonProperty("tradingsymbol")
    private String tradingSymbol;
    private String name;

    @JsonProperty("last_price")
    private float lastPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date expiry;
    private float strike;

    @JsonProperty("tick_size")
    private float tickSize;

    @JsonProperty("lot_size")
    private int lotSize;

    @JsonProperty("instrument_type")
    private String instrumentType;

    @JsonProperty("option_type")
    private String optionType;

    private String exchange;
}
