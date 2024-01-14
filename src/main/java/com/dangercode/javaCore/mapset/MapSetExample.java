package com.dangercode.javaCore.mapset;

import java.util.HashMap;
import java.util.Map;

public class MapSetExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);
        System.out.println(myMap.entrySet());
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

}


