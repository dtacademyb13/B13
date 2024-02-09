package day13;

import java.util.Scanner;

public class WhileTrue {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 7;


        while(true){

            System.out.println("Enter a number between 1-10: ");
            int input = scan.nextInt();

            if(input > 10 || input < 1){
                System.out.println("Invalid input.");
                continue;
            }

            if(input == num){
                System.out.println("Congrats. You found it. ");
                break;
            }

        }


    }
}
