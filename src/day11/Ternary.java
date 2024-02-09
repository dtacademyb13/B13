package day11;

import java.util.Scanner;

public class Ternary {


    public static void main(String[] args) {


        System.out.println("Please enter a sales amount:");


        double salesAmount = new Scanner(System.in).nextDouble();


        // Ternary
//        double commission =  (salesAmount > 10000) ? salesAmount * 0.4 : salesAmount * 0.2;

        // If Else
//        if(salesAmount > 10000){
//            commission = salesAmount * 0.4;
//        }else{
//            commission = salesAmount * 0.2;
//        }


        System.out.println("Your commision is " + ((salesAmount > 10000) ? salesAmount * 0.4 : salesAmount * 0.2));

    }
}
