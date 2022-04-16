package com.java.class04;

public class StringExample {
    public static void main(String args[]){
    int a = 10 , b =20 , c = 30;
            String str1 = "Hello";
            String str2 = "Java" ;

            System.out.println(a);
            System.out.println(a+b); //a+b (bacause it's a String)
        System.out.println("a"+b+ c ); //a2030
            System.out.println(str1+str2);
            System.out.println(str1+a);
            System.out.println(str1+a+b);
            System.out.println(a+b+str1);
            System.out.println("a"+b); //a20 (a is String and b is variable of a type int)

            System.out.println("a+b"); //a+b (because its a String)
        System.out.println(str1+a*b); //Hello200
       // System.out.println(str1+a-b); //Error
        System.out.println(a-b+str1); //-10Hello
}
}
