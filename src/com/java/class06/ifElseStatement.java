package com.java.class06;
import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(num + " is zero");
        }else if(num<0) {
            System.out.println(num + " is negative");
        }else if(num>0) {
            System.out.println(num + " is positive");
        }

        }
    }

