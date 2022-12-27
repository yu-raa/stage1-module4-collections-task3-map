package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();
        for (Integer key : sourceMap.keySet()) {
            if (newMap.containsKey(sourceMap.get(key))) {
                if (key < newMap.get(sourceMap.get(key))) {
                    newMap.replace(sourceMap.get(key), key);
                }
            }
            else {
                newMap.put(sourceMap.get(key), key);
            }
        }
        return newMap;
    }
}
