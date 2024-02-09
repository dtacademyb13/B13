package day13;

import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {



        System.out.println("Welcome to the Daily Expense Tracker!");

        Scanner input = new Scanner(System.in);

        double totalExpenses = 0;
        String answer = null;
        do{

            System.out.println("Please enter your latest expense amount: ");
            double expense = input.nextDouble();

            if (expense < 0){
                System.out.println("Invalid amount. Please enter a positive value.");
                continue;
            }
            totalExpenses += expense;

            System.out.println("Do you have more expenses to enter for the day? (yes/no): ");
            answer = input.next();


        }while(!answer.equalsIgnoreCase("no"));

        System.out.println("You have spent a total of " + totalExpenses + " today");






    }
}
