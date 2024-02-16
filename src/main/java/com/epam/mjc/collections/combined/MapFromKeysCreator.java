package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for(Map.Entry<String, Integer> e : sourceMap.entrySet()){
            result.put(e.getKey().length(), new HashSet<>());
        }
        for(Map.Entry<String, Integer> e : sourceMap.entrySet()){
            for(Map.Entry<Integer, Set<String>> t : result.entrySet()){
                if(e.getKey().length() == t.getKey()){
                    t.getValue().add(e.getKey());
                }
            }
        }
        return result;
    }
}