package com.ihue.algotrading.upstox.service;

import com.ihue.algotrading.upstox.model.OrderDatum;
import com.ihue.algotrading.upstox.model.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class OrderService {
    @Autowired
    private WebClient webClient;

    @Value("${upstox.api.token}")
    private String apiToken;

    public Mono<OrderResponse> placeOrder(
            double price,
            String scripName,
            int quantity,
            String tag,
            boolean isBuy
    ) {
        OrderDatum orderBody = OrderDatum.builder()
                .tag(tag)
                .instrumentToken(scripName)
                .price((float) price)
                .quantity(quantity)
                .transactionType(isBuy ? "BUY" : "SELL")
                .disclosedQuantity(quantity)
                .isAmo(false)
                .triggerPrice((float) price)
                .validity("DAY")
                .product("D")
                .build();

        return webClient.post()
                .uri("order/place")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + apiToken)
                .body(Mono.just(orderBody), OrderDatum.class)
                .retrieve()
                .bodyToMono(OrderResponse.class);

    }
}
