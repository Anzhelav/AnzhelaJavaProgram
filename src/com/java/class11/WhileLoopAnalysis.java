package com.java.class11;

import java.util.Scanner;

public class WhileLoopAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to print");

        int limit =sc.nextInt();
        int i = 1;

        while( i<= limit/2){
            System.out.println(11-i);
            System.out.println(i);




            i++;
        }

    }
}
