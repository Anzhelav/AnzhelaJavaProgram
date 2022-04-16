package com.java.class13;

import java.util.Locale;

public class StringConcatination {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Devx";
        int a = 10;
        int b = 20;
        int c = 5;                          //Output
        System.out.println("Add" + a + b); //Add1020
        System.out.println("Add"+a+b+c);   //Add10205
        System.out.println("Add"+a+b*c);   //Add10100
        System.out.println(a+b+"Add");     //30Add
        System.out.println(a+b+"Add" + 10 +20); //30add1020
        //System.out.println(a+"Add"+b-c); - error
        System.out.println(a+"Add"+(b-c));   // 10Add15
        System.out.println(str1+ a + b + str2  ); //Hello1020Devx
        System.out.println(str1.toUpperCase());   //HELLO
    }
}
