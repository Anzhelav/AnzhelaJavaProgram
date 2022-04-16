package com.java.Homework;
import java.util.Scanner;

public class PalindromeAnzhela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word :");
        String word = sc.nextLine().toLowerCase();
        String inverted = "";
        for(int i = word.length()-1;i>=0;i--){
            inverted = inverted + word.substring(i, i+1);
        }
        System.out.println("Inverted word "+ inverted);
        if(word.equals(inverted)) {
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }


    }
}
