package com.java.class05;

import java.util.Scanner ;

public class ScannerClassExample {
    public static  void main(String[] args) {
        System.out.println("Enter any two numbers:");

        Scanner sc = new Scanner(System.in) ;

        int num1 = sc.nextInt(), num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "is greater");
        }
            if (num2>num1) {

                System.out.println(num2 + "is greater");
            }

        if (num1 == num2){
            System.out.println(" numbers are equal");
        }
    }
}
