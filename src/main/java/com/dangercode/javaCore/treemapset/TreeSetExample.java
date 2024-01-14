package com.dangercode.javaCore.treemapset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Birne");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Grape");
        // Grape is already in the set

        System.out.println(treeSet);
    }
}