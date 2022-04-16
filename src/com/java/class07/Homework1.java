package com.java.class07;
import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Please write product name to find out company name. Choose from : Gmail,  Youtube, " +
                "Hangouts, Whats up, Skype ,Outlook.");
                Scanner sc = new Scanner(System.in);
                String productName= sc.nextLine();

                switch(productName){
                    case "Gmail":
                    case "Youtube":
                    case "Hangouts":
                        System.out.println("This product is made by  Google");
                        break;
                    case "Whats up":
                        System.out.println("This product is made by Facebook ");
                        break;
                    case "Skype" :
                    case "Outlook":
                        System.out.println("This product is made by Microsoft");
                        break;
                    default:
                        System.out.println("Please enter product from the list using uppercase first letter");
                }
    }
}
