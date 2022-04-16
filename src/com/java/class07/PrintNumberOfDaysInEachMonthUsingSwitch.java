package com.java.class07;
import java.util.Scanner;

public class PrintNumberOfDaysInEachMonthUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter the name of the month");

        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        switch (month) {
            case "January":
                System.out.println(month + " has 31 days");
                break;
            case "February":
                System.out.println(month + " has 28/29 days");
                break;
            case "March":
                System.out.println(month + " has 31 days");
                break;
            case "April":
                System.out.println(month + " has 30 days");
                break;
            case "May":
                System.out.println(month + " has 31 days");
                break;
            case "June":
                System.out.println(month + " has 30 days");
                break;
            case "July":
                System.out.println(month + " has 31 days");
                break;
            case "August":
                System.out.println(month + " has 31 days");
                break;
            case "September":
                System.out.println(month + " has 30 days");
                break;
            case "October":
                System.out.println(month + " has 31 days");
                break;
            case "November":
                System.out.println(month + " has 30 days");
                break;
            case "December":
                System.out.println(month + " has 31 days");
            default:
                System.out.println("Please enter a month");

        }
    }
}
