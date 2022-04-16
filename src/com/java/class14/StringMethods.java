package com.java.class14;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to Devx!";
        //1. we want to check equality of two Strings
        System.out.println("1. The equality of two Strings are : "+ str1.equals(str2));
        System.out.println("=========================================================");

        //2. we want to check equality of two Strings ignoring the case
        System.out.println("2. The equality of two Strings ignoring the case are : "+ str1.equalsIgnoreCase(str2));
        System.out.println("=========================================================");

        //3. Check one String contains another String
        //Contains will only check one String contains another string considering case-sensitive
        System.out.println(str2.contains(str1));
        // If we want to check one String contains another String ignoring the Case then we have to change
        //both String in same case and then check contains
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        System.out.println(str2.contains(str1));//OR:
        System.out.println("3.contains :"+ str3LowerCase.contains(str2LowerCase));
        System.out.println("=========================================================");


        //4. Change the case of the String
        System.out.println("Upper case "+str3.toUpperCase());
        System.out.println("Lower case "+str3.toLowerCase());
        System.out.println("=========================================================");

        //5.Find index of character
        System.out.println("5. Index of Char " +str1.indexOf('W'));
        System.out.println("5. Last index of Char " +str3.lastIndexOf('W'));
        System.out.println("=========================================================");

        //6.Find character of particular index
        str1 = "Hello World";
        System.out.println("5. Index of Char " +str1.charAt(0) );
        System.out.println("=========================================================");

        //7.Find length of the String. Length is 11 but indexes are : 12345678910
        System.out.println("7. Length of a String : "+ str1.length());
        System.out.println("7. Length of a String : "+ str3.length());

        System.out.println("=========================================================");

        //8.Empty and Blank String ;
        str1 = "              ";
        str3 = " ";
        System.out.println("8. Empty : " + str1.isEmpty());
        System.out.println("8. Empty : " + str3.isEmpty());
        System.out.println("8. Blank : " + str1.isBlank());
        System.out.println("8. Blank : " + str3.isBlank());
        System.out.println("=========================================================");

        //9. Replace & ReplaceAll
        str1 = "INR 200 INR 300 INR 500";
        str3 = "Devx";
        System.out.println("Replace : " +str1.replace(str1,str3));
        System.out.println("Replace : " +str1.replace("INR","USD"));
        System.out.println("9.ReplaceAll : "+str1.replaceAll("[0-9]",""));
        System.out.println("=========================================================");

        //10.Format
        str1 = "Welcome %s , Welcome to %s";
        System.out.println("10.Format : " + String.format(str1 ,"Chirag","Ebay"));
        System.out.println("=========================================================");

        //11. SubString
        str1 ="Welcome to java class. Today is fun day";
        System.out.println("11. SubString: "+str1.substring(7));
        System.out.println("11.Substring: " + str1.substring(0,7));
        System.out.println("=========================================================");


        //12. Split

        String[] words = (str1.split(" "));
        System.out.println("12.Split : " +words[0]+words[1] +words[2] +words[3]);
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        str2 = "I love ocean";
        String[] word = (str2.split(" "));
        System.out.println(word[0]);
        System.out.println(word[1]);
        System.out.println(word[2]);
        System.out.println(word[0] +word[1] +word[2]);
        System.out.println("==========================");
        for (int i = 0; i<=3 ;i++){
            System.out.println(words[i]);
        }
        System.out.println(word.length);
        for (int i = 0; i<words.length ;i++){
            System.out.println(words[i]);
        }
    }
}
