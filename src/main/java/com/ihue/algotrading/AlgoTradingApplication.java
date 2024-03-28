package com.ihue.algotrading;

import com.ihue.algotrading.upstox.components.RuleValidator;
import com.ihue.algotrading.upstox.components.WebSocketConnection;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Log4j2
public class AlgoTradingApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private RuleValidator ruleValidator;

    public static void main(String[] args) {
        SpringApplication.run(AlgoTradingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // ruleValidator.validate();
        WebSocketConnection client = applicationContext.getBean(WebSocketConnection.class);
        client.connect();

    }
}
