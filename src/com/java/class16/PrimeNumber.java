package com.java.class16;
import java.util.Scanner;
//Write a program to check given number is prime or not

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int count = 0;

      for(int b= 1;b<=a;b++){
          if (a%b==0){
              count++;
          }
      }

            if(count ==2){
                System.out.println(a +" is a prime number" );
        }else {
            System.out.println(" number is not a prime number");
        }

    }
}
