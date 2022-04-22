package com.java.class16;
import java.util.Scanner;
//Write a program to take one String from user and print reverse of it

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String result = "";

        for(int a =str.length()-1; a>=0; a--){
            result = result + str.charAt(a);
        }
        System.out.println(result);

    }
}
