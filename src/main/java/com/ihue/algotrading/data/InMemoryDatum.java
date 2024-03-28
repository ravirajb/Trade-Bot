package com.ihue.algotrading.data;

import com.ihue.algotrading.upstox.model.Instrument;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class InMemoryDatum {
    public static Map<String, List<Instrument>> INSTRUMENT_CACHE = new HashMap<>();

}
