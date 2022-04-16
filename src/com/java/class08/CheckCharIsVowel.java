package com.java.class08;
import java.util.Scanner;

public class CheckCharIsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your character");
        char char1 = sc.next().charAt(0);

        if( char1=='a' ||char1 =='e' ||char1=='u' || char1=='o' ||char1=='i' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Not vowel");
        }

    }
}
