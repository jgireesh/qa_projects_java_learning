package org.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> numLst = new ArrayList<>();
        numLst.add(10);
        numLst.add(20);
        numLst.add(30);
        numLst.add(30);
        numLst.add(40);

        //squared numbers
        List<Integer> sqrNums = numLst.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(sqrNums);

        //distinct numbers
        System.out.println(numLst.stream().distinct().collect(Collectors.toList()));

        //add same number for all list of array
        System.out.println(numLst.stream().map(x -> x+30).collect(Collectors.toList()));

        numLst.stream().forEach(x -> System.out.println(x));

        numLst.stream().forEach(x -> {if(x==20){
            System.out.println("x is 20");
        }});


        int sum = numLst.stream().reduce(0,(ans,i)->ans+i);
        System.out.println("sum using reduce option "+sum);

    }
}
