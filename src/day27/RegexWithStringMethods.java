package day27;

import java.util.Arrays;
import java.util.Scanner;

public class RegexWithStringMethods {

    public static void main(String[] args) {



        String str = "Leo loves burgers";

        String[] split = str.split(" ");

        System.out.println(Arrays.toString(split));


        String input = "Hello World";

        System.out.println(input.matches("He.*")); // true, starts with He
        System.out.println("He ate the cucumbers".matches("He.*")); // true

        //ends with

        System.out.println("World".matches(".*d")); // ends with d
        System.out.println("World".matches(".*rld")); // ends with rld

        // contains

        System.out.println("Hello World".matches(".*ll.*")); // contains ll

//        System.out.println("Enter SSN:");
//        String userInput = new Scanner(System.in).next();
//
//        if(userInput.matches("\\d{3}-\\d{2}-\\d{4}")){
//            System.out.println("The SSN format is correct");
//        }else{
//            System.out.println("SSN format is incorrect");
//        }

        System.out.println("Enter SSN:");
        String userInput = new Scanner(System.in).next();

        if(userInput.matches("\\d{3}-\\d{2}-\\d{3}[1-9]")){
            System.out.println("The SSN format is correct");
        }else{
            System.out.println("SSN format is incorrect");
        }


        System.out.println("14".matches("[1-9][5-9]"));


        //Check the password:
       // "(?=.*\\\\d)(?=.*[A-Z])(?=.*[@#$%]).{8,}"
//        This expression matches password with at least 8 characters, with at least one digit, one
//        uppercase letter, and one special character
        System.out.println("Enter your password: ");
        String pass = new Scanner(System.in).next();

        if(pass.matches("(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%]).{8,}")){
            System.out.println("Password format is correct");

        }else {
            System.out.println("Password format is not correct");
        }

    }
}
