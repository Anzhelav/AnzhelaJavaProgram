package com.java.class07;
import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Please enter the price");
        Scanner sc= new Scanner(System.in);

        double price = sc.nextDouble();

        if (price<100) {
            System.out.println("No discount");
        } else if (price<500) {
            double discount = price * 0.05;
            System.out.println("Your  discount is  " + discount);
        } else if (price<1000) {
            double discount = price * 0.10;
            System.out.println("Your discount is " + discount);
        }else if(price>=1000) {
            double discount = price * 0.15;
            System.out.println("Your  discount is " + discount);

        }
    }
}
