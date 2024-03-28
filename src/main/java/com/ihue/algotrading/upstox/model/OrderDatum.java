package com.ihue.algotrading.upstox.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDatum {
    private int quantity;
    private String product = "D";
    private String validity = "DAY";
    private float price;
    private String tag;
    @JsonProperty("instrument_token")
    private String instrumentToken;

    @JsonProperty("order_type")
    private String orderType="MARKET";

    @JsonProperty("transaction_type")
    private String transactionType;

    @JsonProperty("disclosed_quantity")
    private int disclosedQuantity;

    @JsonProperty("trigger_price")
    private float triggerPrice;

    @JsonProperty("is_amo")
    private boolean isAmo;

}
