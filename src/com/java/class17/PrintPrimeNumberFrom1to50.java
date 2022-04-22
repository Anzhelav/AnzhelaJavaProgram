package com.java.class17;
//Find Prime number from 1 to 50


public class PrintPrimeNumberFrom1to50 {


         public static void main(String[]args){
             isPrime(50);

         }

    static void isPrime(int n) {

        for (int a = 2; a <= n; a++) {
            boolean isPrime = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a);

            }


        }}}



