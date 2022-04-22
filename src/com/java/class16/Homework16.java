package com.java.class16;
//Find divisor of a given number (6)
import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find a divisor:");
        int a = sc.nextInt();

        for(int b=1;b<=a;b++){
            if(a%b==0){
                System.out.println("Given number is divisible by : "+b);
            }
        }
    }
}
