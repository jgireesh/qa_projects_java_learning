package org.learning.operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int val1 = 1;
        int val2 = 2;

        if((val1==1)&&(val2==2)){
            System.out.println("both values are matching && ");
        }
        if((val1==2)||(val2==2)){
            System.out.println("one of the value matching || ");
        }
    }
}
