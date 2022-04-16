package com.java.class15;
import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your First name, Middle name , Last name:");
        String fullName = sc.nextLine();
        String[] str1 =(fullName.split(" ")) ;

        String firstName = str1[0];
        String middleName = str1[1];
        String lastName = str1[2];
        System.out.println(firstName.charAt(0)+". "+ middleName.charAt(0) +". " +lastName.charAt(0) +". ");

    }
}
