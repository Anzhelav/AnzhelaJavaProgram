package com.java.class05;

import java.util.Scanner ;

public class ifElseExample2 {
    public static void main(String[] args) {
      //  System.out.println(15%2 ); //1
      //  System.out.println(52%2); //0
      //  System.out.println(21%2); //1
       // System.out.println(52%2); //0
      //  int num = 6  ;

       // if (num % 2 == 0){
       //     System.out.println("num is even");
       // }else{
        //    System.out.println("num is odd");

        System.out.println("Enter any number - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2  == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



        }




    }

