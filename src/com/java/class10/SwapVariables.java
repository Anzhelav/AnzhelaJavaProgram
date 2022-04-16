package com.java.class10;

public class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a;
        a = b;
        b = c ;

        System.out.println(a);
        System.out.println(b);

        // without using third variable
        a = a + b ;
        b = a / b;
        a = a - b ;

        // without using third variable
    }
}
