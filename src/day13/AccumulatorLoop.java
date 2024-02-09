package day13;

public class AccumulatorLoop {

    public static void main(String[] args) {



        // Find out the total sum of numbers from 1-100

        int total = 0; //accumulator variable
        int i = 1;
        while (i<=100){
//            total = total + i;
            total += i;
//            System.out.println("The total's value at iteration " + i + " is " + total);
            i++;
        }

        System.out.println("The total is: " + total);


    }
}
