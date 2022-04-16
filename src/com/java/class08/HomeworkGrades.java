package com.java.class08;
import java.util.Scanner;

public class HomeworkGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int num1 = sc.nextInt();

        if ( num1>=90 && num1<=100) {
            System.out.println("Your grade is \"A\"");
        }else if ( num1>=80 && num1<=89){
            System.out.println("Your grade is \"B\"" );
        }else if ( num1>=70 && num1<=79) {
            System.out.println("Your grade is \"C\"");
        }else if ( num1>=60&& num1<=69) {
            System.out.println("Your grade is \"D\"");
        }else if ( num1>=50 && num1<=59) {
            System.out.println("Your grade is \"E\"");
        }else if ( num1>=0 && num1<=49) {
            System.out.println(" \"Fail\"");

        }
    }
}
