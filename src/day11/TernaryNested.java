package day11;

import java.util.Scanner;

public class TernaryNested {


    public static void main(String[] args) {


        System.out.println("Please enter a sales amount:");


        double salesAmount = new Scanner(System.in).nextDouble();


        System.out.println("The commission is " +  getCommission(salesAmount));

        // Normal way
//       double commission = 0;
//
//        if(salesAmount > 20000){
//            commission = salesAmount * 0.9;
//        }else if (salesAmount > 10000){
//            commission = salesAmount * 0.4;
//        }else{
//            commission = salesAmount * 0.2;
//        }

        // Ternary way
//        double commission = salesAmount > 20000  ? salesAmount * 0.9 :  salesAmount > 10000 ? salesAmount * 0.4 : salesAmount * 0.2 ;
//
//        System.out.println("Your commision is " + commission);

    }


    public static double getCommission(double salesAmount){

        // Ternary version
        return salesAmount > 20000  ? salesAmount * 0.9 :  salesAmount > 10000 ? salesAmount * 0.4 : salesAmount * 0.2 ;

        // Normal version
//        if(salesAmount > 20000){
//            return salesAmount * 0.9;
//        }else if (salesAmount > 10000){
//            return salesAmount * 0.4;
//        }else{
//            return salesAmount * 0.2;
//        }


    }

}
