package org.learning.operators;

public class ArithmeticOperator {

    public static void main(String[] args) {
        int result = 10+5;

        System.out.println("original result - subtracted by : "+ (result=result-3));

        System.out.println("original result / divide  by : "+ (result=result/4));

        System.out.println("original result * multiply : "+(result = result*5));

        System.out.println("original result + addition : "+(result=result+5));

        System.out.println("original result % reminder : "+ (result=result/3));

        System.out.println("final result casted in decimal place : "+ (float) result);

    }
}
