package com.ihue.algotrading.upstox.config;


import com.upstox.ApiClient;
import com.upstox.ApiException;
import com.upstox.api.WebsocketAuthRedirectResponse;
import com.upstox.auth.OAuth;
import io.swagger.client.api.WebsocketApi;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static com.ihue.algotrading.data.InMemoryDatum.INSTRUMENT_CACHE;
import static com.ihue.algotrading.utils.Constants.*;
import static com.ihue.algotrading.utils.Utilities.readCSV;
import static com.ihue.algotrading.utils.Utilities.unzipAndUse;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;
import static org.springframework.http.HttpHeaders.USER_AGENT;

@Component
@Log4j2
public class TradingBean {

    @Value("${upstox.api.token}")
    private String apiToken;

    @Value("${upstox.api.url}")
    private String upstoxBaseUrl;

    @Value("${upstox.csv.url}")
    private String csvUrl;

    /**
     * Generate Upstx API Client
     * @return ApiClient
     */
    @Bean("upstoxApiClient")
    public ApiClient getAPIClient () {
        ApiClient defaultClient = com.upstox.Configuration.getDefaultApiClient();
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(apiToken);
        return defaultClient;
    }

    /**
     * Generate Upstx WebSocket URL
     * @param apiClient
     * @return URI
     * @throws ApiException
     */
    @Bean("webSocketUri")
    public URI getWebSocketURI(ApiClient apiClient) throws ApiException {
        WebsocketApi websocketApi = new WebsocketApi(apiClient);
        WebsocketAuthRedirectResponse response = websocketApi.getMarketDataFeedAuthorize("2.0");

        return URI.create(response.getData()
                .getAuthorizedRedirectUri());
    }

    @Bean("upstoxClient")
    public WebClient myWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl(upstoxBaseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(USER_AGENT, USER_AGENT)
                .build();
    }

    /**
     * This method downloads the instrument file for Upstox from URL
     * Loads the CSV file to a cache for processing
     * @throws IOException
     *
     */
    // @PostConstruct
    public void dnlUpstxInstrFile() throws IOException {
        WebClient client = WebClient.create(csvUrl);
        Flux<DataBuffer> buffer = client.get()
                .retrieve()
                .bodyToFlux(DataBuffer.class);

        Path path = Paths.get(SOURCE_PATH );
        Path targetPath = Paths.get(TARGET_PATH);

        DataBufferUtils.write(buffer, path, StandardOpenOption.CREATE)
                .block();

        unzipAndUse(path, targetPath);
        readCSV(TARGET_PATH);

        log.info("InstrumentLength:{}",  INSTRUMENT_CACHE.get(INSTRUMENTS).size());
    }
}
