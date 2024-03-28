package com.ihue.algotrading.utils;

import com.ihue.algotrading.upstox.model.OneMinAggregateDatum;
import com.ihue.algotrading.upstox.model.TradeVals;

import java.io.File;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Constants {
    String INSTRUMENTS = "INSTRUMENTS";
    String SOURCE_PATH = "." + File.separator + "complete.csv.gz";
    String TARGET_PATH = "." + File.separator + "complete.csv";
    ZoneId IST_ZID = ZoneId.of("IST", ZoneId.SHORT_IDS);

    Map<String, Map<Long, OneMinAggregateDatum>> dataMap = new HashMap<>();
    Map<String, TradeVals> values = new HashMap<>();


}
