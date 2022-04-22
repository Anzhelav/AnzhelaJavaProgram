package com.java.class16;

import java.util.Locale;

public class FindOccurenceOfChar {
    public static void main(String[] args) {
        String str ="This is my java program !";
        char c = 'a';
        int count =0;
        for (int a=0; a<str.length();a++){
            if (str.toLowerCase().charAt(a)==c){
                count++;
            }

        }
        System.out.println(count);
    }
}
