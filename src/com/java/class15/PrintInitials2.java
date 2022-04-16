package com.java.class15;
import java.util.Scanner;
//Print reverse of given String
public class PrintInitials2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();


        for(int a=str.length()-1 ; a>=0;  a--){
            System.out.print(str.charAt(a));


        }


    }
}
