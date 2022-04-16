package com.java.Homework;

import java.util.Locale;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str1 = "Ocean";
        String str2 = "ocean";
        String str3 = "Ocean";
        String str4 = "sea";
        //1.
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("===========================");

        //2
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str3.equalsIgnoreCase(str1));
        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println("===========================");

        //3
        str3 = "I love ocean";
        System.out.println(str1.contains(str3));
        System.out.println(str3.contains(str1));
        System.out.println(str1.contains(str3.toLowerCase()));
        System.out.println(str3.contains(str1.toLowerCase()));
        System.out.println(str3.contains(str1.toUpperCase()));
        System.out.println("===========================");

        //4
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str4.toUpperCase());
        System.out.println("===========================");

        //5
        System.out.println(str1.indexOf("O"));
        System.out.println(str3.indexOf("v"));
        System.out.println(str2.indexOf("e"));
        System.out.println(str4.indexOf("e"));
        System.out.println("===========================");

        //6
        System.out.println(str1.charAt(0));
        System.out.println(str3.charAt(3));
        System.out.println(str4.charAt(2));
        System.out.println(str3.charAt(6));
        System.out.println("===========================");

        //7
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println("===========================");

        //8
        String str5 = "   ";
        String str6 = "";
        System.out.println(str5.isEmpty());
        System.out.println(str6.isEmpty());
        System.out.println(str5.isBlank());
        System.out.println(str6.isBlank());
        System.out.println("===========================");

        //9
        System.out.println(str1.replace(str1,str2));
        System.out.println(str3.replace(str3,str1));
        System.out.println(str1.replace(str1,str3));
        System.out.println(str3);
        System.out.println(str1);
        System.out.println("===========================");

        //10
        String str7 = "The  %s , is blue ";
        System.out.println(String.format(str7,"ocean"));
        System.out.println(String.format(str7,"ocean in Hawaii"));


        //9.
        str7 = "I start my java class at 6.The class ends at 9.";
        System.out.println(str7.replaceAll("[0-9]"," "));
        System.out.println(str7.replaceAll("[a-z]"," "));








    }
}
