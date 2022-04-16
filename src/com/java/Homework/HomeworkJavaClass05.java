package com.java.Homework;
import java.util.Scanner;
public class HomeworkJavaClass05 {
    public static void main (String[]args){
        System.out.println(" Enter any number -");
        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();

        if(num % 5 == 0 ) {
            System.out.println(num + " is divided by 5 ");
        }else{
            System.out.println(num + " is not divided by 5 ");
        }
    }
}
