package com.java.Homework;

    public class PrintHalfTwice {

        public static void main(String[] args) {
            /**
             * Write a program that prints first half twice
             * if the word is odd then print a larger first half twice
             * ex:
             * Jabber -> JabJab
             * abc -> abab
             */
            String word = "Jabber";
            PrintHalfTwice printHalfTwice = new PrintHalfTwice();
            printHalfTwice.execute(word);
        }

        //no loops required
        public void execute(String word) {
            //TODO implement method
            if (word.length()%2==0){
                System.out.print ((word.substring(0,word.length()/2))+(word.substring(0,word.length()/2)));
            }else{
                System.out.println((word.substring(0,word.length()/2+1))+(word.substring(0,word.length()/2+1)));
            }
    }}

