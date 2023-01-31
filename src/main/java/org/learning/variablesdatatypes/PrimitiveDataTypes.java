package org.learning.variablesdatatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte  b = 3;// 8 bit signed complement integer
        short shrt = 4; // 16 bit integer, used only when memory issues
        int numint = 25; // 32 bit integer
        float flt = 5.445F; // 32 bit float
        double dbl = 4; //64 bit floating point
        boolean bln = true; //boolean true or false
        char ch = 'm'; //character
        long lng = 798234121; // 64 bit integer

        System.out.println(b);
        System.out.println(shrt);
        System.out.println(numint);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(bln==true);
        System.out.println(ch);
        System.out.println(lng);
    }
}
