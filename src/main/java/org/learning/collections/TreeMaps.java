package org.learning.collections;

import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(3,"D");
        treeMap.put(1,"B");
        treeMap.put(2,"A");

        System.out.println(treeMap);
    }
}
