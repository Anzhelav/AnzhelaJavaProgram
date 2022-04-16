package com.java.class11;

import java.util.Scanner;

public class HomeWorkWhileLoop6 {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit:");
        int limit = sc.nextInt();

        while (i <= limit) {
            if ( i % 3 != 0 && i % 7 ==0){
                System.out.println(i);

            }
            i++;
        }
    }
}
