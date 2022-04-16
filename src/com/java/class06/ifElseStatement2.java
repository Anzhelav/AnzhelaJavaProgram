package com.java.class06;
import java.util.Scanner;

public class ifElseStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month in numbers");
        int monthNum = sc.nextInt();
        if (monthNum == 1) {
            System.out.println(monthNum + " has 31 days");
        } else if (monthNum == 2) {
            System.out.println(monthNum + " has 29 days");
        }else if (monthNum == 3) {
            System.out.println(monthNum + " has 31 days");
        }else if (monthNum == 4) {
            System.out.println(monthNum + " has 30 days");
        }else if (monthNum == 5) {
            System.out.println(monthNum + " has 31 days");
        }else if (monthNum == 6) {
            System.out.println(monthNum + " has 30 days");
        }else if (monthNum == 7) {
            System.out.println(monthNum + " has 31 days");
        }else if (monthNum == 8) {
            System.out.println(monthNum + " has 31 days");
        }else if (monthNum == 9) {
            System.out.println(monthNum + " has 30 days");
        }else if (monthNum == 10) {
            System.out.println(monthNum + " has 31 days");
        }else if (monthNum == 11) {
            System.out.println(monthNum + " has 30 days");
        }else if (monthNum == 12) {
            System.out.println(monthNum + " has 31 days");
        }
    }
}