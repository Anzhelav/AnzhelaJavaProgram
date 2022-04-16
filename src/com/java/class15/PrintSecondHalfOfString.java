package com.java.class15;
import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine();
        if(str.length()%2 ==0) {
            System.out.println(str.substring(str.length() / 2));
        }else{
            System.out.println(str.substring((str.length() / 2)+1));
        }






    }
}
