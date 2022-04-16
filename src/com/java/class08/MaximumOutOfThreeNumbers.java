package com.java.class08;
import java.util.Scanner;

public class MaximumOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers and I will print the maximum number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2 && num1 >num3) {
            System.out.println("The maximum number is " + num1);
        } else if (num2 > num1 && num2> num3) {
            System.out.println("The maximum number is "+num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("The maximum number is "+ num3);
        }else if(num1==num2){
            System.out.println(num1);
        }
    }

}
