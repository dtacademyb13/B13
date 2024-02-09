package day10;

import java.util.Scanner;

public class SwitchDemo2 {


    public static void main(String[] args) {


        System.out.println("Welcome to Selenium:");
        System.out.println("Enter your browser that you want to test:");

        String userInput = new Scanner(System.in).next();


        final String someVar = "edge";
        switch (userInput){  // variable inside the () can be int or less than int or String
           // System.out.println();
            case "chrome":
                System.out.println("Launching Chrome...");
                break;
            case "safari":
                System.out.println("Launching Safari...");
                break;
//            case someVar: doesn't work since it is a variable, unless you make it a constant
            case someVar:
                System.out.println("Launching Edge...");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
