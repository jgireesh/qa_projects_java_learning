package org.learning.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ArrayLists {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(5);
        System.out.println(arrayList.size());
        for(int i=0;i<5;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for(int i:arrayList){
            System.out.println(i);
        }

        arrayList.add(9);

        System.out.println(arrayList);
    }
}
