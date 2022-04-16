package com.java.class11;
//1 2 * 4 5 * 7 8 * 10

import java.util.Scanner;

public class InClassExample1 {
    public static void main(String[] args) {
       // System.out.println("Please enter how many numbers you want to print" );
        Scanner sc = new Scanner(System.in);
      //  int limit = sc.nextInt();
       // int i = 1;
       // while(i <= limit){
        //    System.out.println(i);
        //    i++;
         //   System.out.println(i);
         //   i++;
          //  System.out.println("*");
        //    i++;
       // }


        // another way
        System.out.println("Please enter how many numbers you want to print");
        int num = sc.nextInt();
        int i = 1;

        while (i<=num){
            if(i%3 ==0) {
                System.out.println("*");
            }else{
                System.out.println(i);
            }
            i++;
        }
    }
}
