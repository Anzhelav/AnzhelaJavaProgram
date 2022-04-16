package com.java.Homework;
import java.util.Scanner;
public class Palindrome1 {
    public static void main(String[] args) {
        System.out.println("Please enter your word");
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String inverted ="";
        if(word.equals(inverted)) {
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
