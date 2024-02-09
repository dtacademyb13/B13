package day10;

import java.util.Scanner;

public class ForgettingBreak {


    public static void main(String[] args) {




        System.out.println("Please select  your coffee flavor (Enter the number): \n1. Espresso\n2. Cappuccino\n3. Latte\n4. Mocha\n5. Americano ");

        int coffeeTypes = new Scanner(System.in).nextInt();
        switch (coffeeTypes){

            case 1:
                System.out.println("One Espresso coming right up!");

            case 2:
                System.out.println("Cappuccino - a classic choice!");

            default:
                System.out.println("Sorry, we don't recognize that order.");

            case 3:
                System.out.println("Latte with the perfect mix of milk and coffee!");

            case 4:
                System.out.println("Mocha with a hint of chocolate, yum!");

            case 5:
                System.out.println("Americano for the strong coffee lovers!");





        }
    }
}
