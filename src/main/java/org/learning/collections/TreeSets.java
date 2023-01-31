package org.learning.collections;

import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {

        TreeSet <String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");

        System.out.println(treeSet);
        System.out.println(treeSet.pollFirst());
    }
}
