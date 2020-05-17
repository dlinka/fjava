package com.cr.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopMap {

    Map<String, Integer> map = new HashMap<>();

    public void loop1() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }

    public void loop2() {
        for (String key : map.keySet()) {
        }
        for (Integer value : map.values()) {
        }
    }

    public void loop3() {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            entry.getKey();
            entry.getValue();
        }
        Iterator<String> iteratorKey = map.keySet().iterator();
        while (iteratorKey.hasNext()) {
            iteratorKey.next();
        }
        Iterator<Integer> iteratorValue = map.values().iterator();
        while (iteratorValue.hasNext()) {
            iteratorValue.next();
        }
    }

}
