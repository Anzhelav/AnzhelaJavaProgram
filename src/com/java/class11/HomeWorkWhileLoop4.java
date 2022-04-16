package com.java.class11;
import java.util.Scanner;

public class HomeWorkWhileLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Please enter a number to print a table of :");
        int num = sc.nextInt();

        while(i<=10){
            System.out.println(i*num);
            i++;
        }


    }
}
