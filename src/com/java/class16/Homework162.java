package com.java.class16;

public class Homework162 {
    public static void main(String[] args) {
        int result = 0;

        for(int b=1;b<=10;b++){
            if( b%3==0){
                result =result-b;
            }else{
                result = result+b;
            }


        }
        System.out.println(result);


    }
}
