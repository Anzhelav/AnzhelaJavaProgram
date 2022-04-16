package com.java.Homework;
import java.util.Scanner;

public class JavaClass08Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check if it's divisible by 3 or 5");
        int num1 = sc.nextInt();

        if(num1 % 5 == 0){
            System.out.println("Number is divisible by 5");
        }else if(num1 % 3 ==0){
            System.out.println("Number is divisible by 3");
        }else{
            System.out.println("Number is not divisible by 5 or 3 ");
        }

    }
}
