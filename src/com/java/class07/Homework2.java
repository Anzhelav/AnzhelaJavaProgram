package com.java.class07;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Please enter your character to check whether it's a vowel or not");
        Scanner sc = new Scanner(System.in);
        char char1= sc.next().charAt(0);
        char1 = Character.toLowerCase(char1);

        switch(char1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
                System.out.println("Your character is vowel");
                break;
            default:
                System.out.println("Your character is not vowel");



        }


        }
}
