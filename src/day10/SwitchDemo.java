package day10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchDemo {


    public static void main(String[] args) {


        System.out.println("Welcome to Duotech ATM. Please choose one of the following:");
        System.out.println("1. Checking\n2. Savings\n3. Withdrawal\n4. Deposit\n");

        int userInput = new Scanner(System.in).nextInt();

//        if(userInput == 1){
//
//        } else if (userInput == 2) {
//
//        }
        switch (userInput){
           // System.out.println();
            case 1:
                System.out.println("Welcome to your Checking account");
                System.out.println("Here's your balance");
                break;
            case 2:
                System.out.println("Welcome to your Savings account");
                System.out.println("Here's your balance");
                break;
            case 3:
                System.out.println("Welcome to your account");
                System.out.println("Do you want to withdraw from checking or savings? ");
                break;
            case 4:
                System.out.println("Welcome to your account");
                System.out.println("Do you want to deposit to checking or savings? ");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
