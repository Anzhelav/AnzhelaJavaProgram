package com.java.Homework;
import java.util.Scanner;
public class GPHW4 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int a = 0;
    int digits =0;
    System.out.println("Enter a number and I'll calculate the sum until you enter a negative number");
        a = sc.nextInt();
        while (a >= 0) {
            digits++;
            sum = sum + a;
            System.out.println("The number is not negative. Please enter another number");
            a = sc.nextInt();
        }

            if (a < 0) {
                System.out.println("Yhe number is negative.The quantity of digits entered is " + digits + ". The sum of all numbers is " + sum);
            }
        }}
