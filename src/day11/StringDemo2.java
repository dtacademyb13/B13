package day11;

import java.util.Scanner;

public class StringDemo2 {


    public static void main(String[] args) {




        String str1 = "hello";
        String str2 = " world";

        String combined = str1.concat(str2);

        // simply calling a method on a string object does NOT change the string object's value
        // because strings are immutable -> cannot change the original value after initial assignment

//        str1 = str1.concat(str2);

        System.out.println(str1);

        System.out.println(combined);


        String str3 = "Bye Felicia2009!";

        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        String str4 = "          Hello, my name is John Doe!\n\r\t          "; // removes all whitespace chars from both ends

        String trimmed = str4.trim();

        System.out.println(trimmed);


        System.out.println("Please enter a username: " );

        String input = new Scanner(System.in).nextLine();

        System.out.println("Your username is " + input.trim());


    }



}
