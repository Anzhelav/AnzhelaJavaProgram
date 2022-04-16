package com.java.class06;
import java.util.Scanner ;
public class BloodDonationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inputs
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your weight");
        int weight = sc.nextInt();

        //Out
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You're eligible");
            } else {
                System.out.println("You're underweight");
            }
        } else {
            if (weight >= 50) {
                System.out.println("You're too young");
            } else {
                System.out.println("You're totally not eligible");
            }
        }
    }
}