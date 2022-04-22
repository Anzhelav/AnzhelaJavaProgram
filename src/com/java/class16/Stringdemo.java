package com.java.class16;
import java.util.Scanner;

public class Stringdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

        //StringBuffer uses the buffer mechanism to protect data from being accessed and updated simultaneously ,so its thread-safe
        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();

        //String Builder doesn't have buffer mechanism ,so it's faster than StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();

    }
}
