package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address =" 2100, Main Street, apt300, Melrose Park, IL, 60160";
        String[] word = (address.split(","));
        for(int i =0 ;i<6; i++){
            System.out.println(word[i]);
        }

    }
}
