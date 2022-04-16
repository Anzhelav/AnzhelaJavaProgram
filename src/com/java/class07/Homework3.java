package com.java.class07;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        String username = "Anzhela";
        String password = "Vasylyk97";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String usernameInput = sc.nextLine();
        System.out.println("Please enter your password:");
        String passwordInput = sc.nextLine();



        if(  username.equals(usernameInput) ){
            if(password.equals(passwordInput)){
                System.out.println("Login successful");
            }else{
                System.out.println("Invalid password");
            }
        }else if(password.equals(passwordInput) ){
            System.out.println("Invalid username");
        } else {
            System.out.println("Login unsuccessful");
        }
    }



}

