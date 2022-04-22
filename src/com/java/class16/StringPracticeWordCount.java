package com.java.class16;
import java.util.Scanner;
//Write a program to take one statement from user and count how many words we have inside  the statement


public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to find out how many words does it have :");
        String str = sc.nextLine();
        String[] str2 = (str.split(" "));
        System.out.println(str2.length);

        }
    }
