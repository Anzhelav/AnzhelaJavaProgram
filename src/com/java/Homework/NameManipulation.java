package com.java.Homework;

import java.util.Locale;

public class NameManipulation {

        public static void main(String[] args) {
            NameManipulation nameManipulation = new NameManipulation();
            String fullName = "leo messi";


            /**
             * Write a program that prints as a below example output using methods
             *
             *
             * Full name is leo messi
             * Initials are LM
             * First name is Leo
             * Last name is Messi
             */

            System.out.println("Full name is " + nameManipulation.convertFirstLetterOfNameAndLastNameToUppercase(fullName));

            String initials = nameManipulation.getInitials(fullName);
            System.out.println("Initials are " + initials);

            String firstName = nameManipulation.getFirstNameFrom(fullName);
            System.out.println("First name is " + firstName);

            String lastName = nameManipulation.getLastNameFrom(fullName);
            System.out.println("Last name is " + lastName);

        }

        /**
         * Write a function that converts first letter of first name and last name to Uppercase
         *
         * @param fullName
         * @return String
         */
        public String convertFirstLetterOfNameAndLastNameToUppercase(String fullName){
            //TODO implement method
           String str1 = (fullName.substring(0,1).toUpperCase()+fullName.substring(1,4)+""+fullName.substring(4).toUpperCase());
           fullName=str1;
           return fullName;
        }

        /**
         * Write a function that gets initials from full name
         *
         * @param fullName
         * @return String
         */
        public String getInitials(String fullName) {
            //TODO implement method
            String[] str1 =(fullName.split(" ")) ;

            String firstName = str1[0];
            String lastName = str1[1];
           fullName=(firstName.substring(0,1).toUpperCase()+" "+lastName.substring(0,1).toUpperCase());
            return fullName;
        }

        /**
         * Write a function that gets first name from full name
         *
         * @param fullName
         * @return String
         */
        public String getFirstNameFrom(String fullName) {
            //TODO implement method
            String[] str3=(fullName.split(" "));
            String lastName =(str3[0].substring(0,1).toUpperCase()+str3[0].substring(1));

            return lastName;
        }

        /**
         * Write a function that gets last name from full name
         *
         * @param fullName
         * @return String
         */
        public String getLastNameFrom(String fullName) {
            //TODO implement method
            String[] str3=(fullName.split(" "));
            String lastName =(str3[1].substring(0,1).toUpperCase()+str3[1].substring(1));
            return lastName;
        }

    }


