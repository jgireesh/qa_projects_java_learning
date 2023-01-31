package org.learning.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

    public static void main(String[] args) {

        Set<Object> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add(true);
        hashSet.add(4);

        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(4));
    }
}
