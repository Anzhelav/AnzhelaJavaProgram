package com.java.Homework;
import java.util.Scanner;

public class JavaClass08Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size in inches from 27 to 50 to find out your T-shirt size");
        double size = sc.nextDouble();

        if( size >=27 && size<=30){
            System.out.println("Your T-shirt size is XS ");
        }else if(size>=31 && size<=34){
            System.out.println("Your T-shirt size is S");
        }else if(size>=35 && size<=38) {
            System.out.println("Your T-shirt size is L");
        }else if(size>=39 && size<=42) {
            System.out.println("Your T-shirt size is XL");
        }else if(size>=45 && size<=50) {
            System.out.println("Your T-shirt size is XXL");

        }
    }
}
