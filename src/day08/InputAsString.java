package day08;

import java.util.Scanner;

public class InputAsString {


    public static void main(String[] args) {


        System.out.println("Welcome to your Bank. Choose one of the following:");
        System.out.println("Checking ");
        System.out.println("Savings ");
        System.out.println("Balance ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(input.equals("Checking")){  // never compare String with ==, use equals() method
            System.out.println("Checking");
        }else if (input.equals("Savings")) {
            System.out.println("Savings");
        }else if (input.equals("Balance")) {
            System.out.println("Balance");
        }else {
            System.out.println("Wrong input");
        }
    }
}
