package com.cr.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopMap {

    private void loop1(){
        Map<String, Integer> map = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            //entry.getKey()
            //entry.getValue()
        }
    }

    private void loop2(){
        Map<String, Integer> map = new HashMap<>();
        for(String key : map.keySet()){}
        for(Integer value : map.values()){}
    }

    private void loop3(){
        Map<String, Integer> map = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            //entry.getKey()
            //entry.getValue()
        }
        Iterator<String> iteratorKey = map.keySet().iterator();
        while(iteratorKey.hasNext()){
            //iteratorKey.next()
        }
        Iterator<Integer> iteratorValue = map.values().iterator();
        while(iteratorValue.hasNext()){
            //iteratorValue.next()
        }
    }
}
