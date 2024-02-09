package day08;

import java.util.Scanner;

public class MultiwayIfElse {


    public static void main(String[] args) {

        System.out.println("Welcome to your Bank. Choose one of the following:");
        System.out.println("1. Checking ");
        System.out.println("2. Savings ");
        System.out.println("3. Check balance ");
        System.out.println("4. Print statement ");
        System.out.println("5. Exit ");

        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        if(userInput == 1){
            System.out.println("Welcome to your Checking account");
        }else if (userInput == 2){
            System.out.println("Welcome to your Savings account");
        }else if(userInput == 3){
            System.out.println("Here's your balance");
        }else if(userInput == 4){
            System.out.println("Printing your statement");
        }else if(userInput == 5){
            System.out.println("Thanks and goodbye");
        }else{
            System.out.println("Invalid input");
        }


    }
}
