package day13;

import java.util.Random;
import java.util.Scanner;

public class AccumulatorLoop5 {

    public static void main(String[] args) {


      // Ask the user to enter numbers and display the total


        Scanner scanner = new Scanner(System.in);
        int total = 0;

        while(true){

            System.out.println("Enter a number (-1 to end): ");
            int num = scanner.nextInt();


            if (num == -1) {
                break;
            }

            total += num;


        }

        System.out.println("The total is " + total);










    }
}
