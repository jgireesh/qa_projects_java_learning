package org.learning.operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int result = 10;

        System.out.println("original result : " + result);

        result--;
        System.out.println("original result : " + result);

        result++;
        System.out.println("original result : " + result);

        result = +result;
        System.out.println("original result : " + result);

        result = -result;
        System.out.println("original result : " + result);
    }
}
