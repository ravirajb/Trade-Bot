package com.ihue.algotrading.upstox.dao;

import com.ihue.algotrading.upstox.model.Datum;
import com.upstox.marketdatafeeder.rpc.proto.Upstox;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@Log4j2
public class StocksDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void checkConnectivity() {
        Integer retVal = jdbcTemplate.queryForObject("select count(1) from stock_info", Integer.class);
        log.info("retVal:{}", retVal);
    }

    public List<Upstox.LTPC> getTrades() {
        return jdbcTemplate.query("select scrip_name, last_trade_time , last_trade_price , last_trade_quantity  " +
                "from stock_info si where scrip_name = 'NSE_FO|53951' order by created_at asc",
                (rs, rowNum) ->
                        Upstox.LTPC.newBuilder()
                                .setLtp(rs.getFloat("last_trade_price"))
                                .setLtt(rs.getLong("last_trade_time"))
                                .setLtq(rs.getInt("last_trade_quantity"))
                                .build()
                );
    }

    public void insertAggr() {

    }
}
