package com.ihue.algotrading.upstox.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private String status;
    private ResponseData data;
}

class ResponseData {
    @JsonProperty("order_id")
    private String orderId;

}