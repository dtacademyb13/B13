package day13;

import java.util.Random;

public class AccumulatorLoop2 {

    public static void main(String[] args) {



        // Find out the average age of 100 students

        int total = 0; //accumulator variable
        int i = 1;
        while (i<=100){
           int studentAge = 20 + new Random().nextInt(31); // generate random age between 20-50
            total += studentAge;
//            System.out.println("The total's value at iteration " + i + " is " + total);
            i++;
        }

        System.out.println("The total age is: " + total);
        System.out.println("The average age is: " + total/100.0);


    }
}
