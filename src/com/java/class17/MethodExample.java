package com.java.class17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodExample {
    static void printLineStar(int length, char c) {
        for (int i = 1; i <= length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printLineStar(30,'=');
        System.out.println("Please enter first number:");
        printLineStar(30,'=');
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printLineStar(30,'*');


        System.out.println("Please enter second number :");
        printLineStar(30,'~');
        int b = sc.nextInt();
        printLineStar(30,'~');


        System.out.println("Please enter the operation");
        printLineStar(30,'=');
        String operation = sc.next();
        printLineStar(30,'=');
        switch (operation) {
            case "Add":
                System.out.println(a + b);
                break;
            case "Sub":
                System.out.println(a - b);
                break;
            case "Div":
                System.out.println(a / b);
                break;
            case "Mul":
                System.out.println(a * b);
                break;

            default:
                System.out.println("Invalid choice...please try after hangout");
        }
        printLineStar(30,'=');

    }
}
