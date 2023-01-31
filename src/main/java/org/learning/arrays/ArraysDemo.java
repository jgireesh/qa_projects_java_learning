package org.learning.arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] array;
        array = new int [5];
        array[0]=100;
        array[1]=200;
        array[2]=300;
        array[3]=400;
        array[4]=500;

        System.out.println(array[4]);

        String [] strs;
        strs = new String[3];
        strs[0]="abcd";
        strs[1]="efgh";
        strs[2]="ijkl";

        System.out.println(strs[1]);
    }
}
