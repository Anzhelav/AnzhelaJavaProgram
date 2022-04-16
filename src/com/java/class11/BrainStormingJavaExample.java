package com.java.class11;

import java.util.Scanner;

public class BrainStormingJavaExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to print");
        int num  = sc.nextInt();
        int i = 1;
        while (i<=num) {
            System.out.println(i*6);
            i++;


        }

    }
}
