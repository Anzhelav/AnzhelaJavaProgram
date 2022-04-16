package com.java.class13;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Tea";
        String str2 = "Tea";
        String str3 = sc.nextLine();
//1
        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
//2
//
            if (str2 == str3) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
//3
            if (str1.equals(str3)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}