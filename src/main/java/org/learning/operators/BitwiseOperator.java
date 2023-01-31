package org.learning.operators;

public class BitwiseOperator {
    public static void main(String[] args) {

        //initial values
        int a = 5;
        int b = 7;

        //bitwise and
        // 0101 & 0111 = 0101 which is 5
        System.out.println("a&b = "+(a&b));

        //bitwise or
        //0101 | 0111 = 7
        System.out.println("a|b = "+(a|b));
    }
}
