package day08;

import java.util.Scanner;

public class IfElse {


    public static void main(String[] args) {
//
        System.out.println("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
//
//
        if(number >= 0){
            System.out.println(number + " is positive");
        }else{
            System.out.println(number  +  " is negative");

        }

     int n = 51;
        // to check if number is divisible by another  number
        System.out.println( n % 5 == 0   );


        if(n % 5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }



    }
}
