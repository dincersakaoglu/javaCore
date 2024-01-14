package com.dangercode.javaCore.treemapset;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "drei");
        treeMap.put(1, "eins");
        treeMap.put(4, "vier");
        treeMap.put(2, "zwei");

        System.out.println(treeMap);
    }
}