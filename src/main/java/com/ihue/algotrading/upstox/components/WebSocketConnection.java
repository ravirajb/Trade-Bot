package com.ihue.algotrading.upstox.components;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ihue.algotrading.upstox.dao.StocksDAO;
import com.ihue.algotrading.upstox.service.TradeService;
import com.upstox.marketdatafeeder.rpc.proto.Upstox;
import lombok.extern.log4j.Log4j2;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Component("wsClient")
@Log4j2
public class WebSocketConnection extends WebSocketClient {

    @Autowired
    @Qualifier("webSocketUri")
    private URI serverUri;

    @Autowired
    private TradeService tradeService;

    public WebSocketConnection(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        sendSubscriptionRequest(this);
    }

    @Override
    public void onMessage(String s) {

    }

    @Override
    public void onMessage(ByteBuffer bytes) {
        handleBinaryMessage(bytes);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        log.info("Connection closed: s:{}", s);
    }

    @Override
    public void onError(Exception e) {

    }

    private void sendSubscriptionRequest(WebSocketClient client) {
        JsonObject requestObject = constructSubscriptionRequest();
        byte[] binaryData = requestObject.toString()
                .getBytes(StandardCharsets.UTF_8);

        log.info("requestObject:{}: ", requestObject);
        client.send(binaryData);
    }

    private JsonObject constructSubscriptionRequest() {
        JsonObject dataObject = new JsonObject();
        dataObject.addProperty("mode", "full");

        JsonArray instrumentKeys = new Gson().toJsonTree(Arrays.asList("NSE_EQ|INE081A01020"))
                .getAsJsonArray();
        dataObject.add("instrumentKeys", instrumentKeys);

        JsonObject mainObject = new JsonObject();
        mainObject.addProperty("guid", UUID.randomUUID().toString());
        mainObject.addProperty("method", "sub");
        mainObject.add("data", dataObject);

        return mainObject;
    }

    private void handleBinaryMessage(ByteBuffer bytes) {
        try {
            Upstox.FeedResponse feedResponse = Upstox.FeedResponse.parseFrom(bytes.array());
            // System.out.println(feedResponse);
            tradeService.doTrades(feedResponse);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
