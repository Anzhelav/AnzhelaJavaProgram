package com.java.class18;
import java.util.Locale;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your String:");
        String str = sc.nextLine().toUpperCase();
        isPalindrome (str);

    }


    static void isPalindrome(String str){
       String rev = "";
        for(int i = str.length() - 1; i>=0; i-- ){
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }


    }
}