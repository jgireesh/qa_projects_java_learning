package org.learning.collections;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<Integer, String> maps =new HashMap<>();
        maps.put(1,"a");
        maps.put(2,"b");
        maps.put(3,"c");
        maps.put(4,"d");

        System.out.println(maps);

        System.out.println(maps.get(3));

        System.out.println(maps.containsKey(3));

        System.out.println(maps.containsValue("b"));

        maps.replace(2,"b","e");
        System.out.println(maps);
    }
}
