package day03;

public class Constants {

    public static void main(String[] args) {


        int yearOfBirth = 2020;
        System.out.println(yearOfBirth);

        yearOfBirth = 2022;

        System.out.println(yearOfBirth);

        int anotherYear = 2030;

        yearOfBirth = anotherYear;

        System.out.println(yearOfBirth);


        final double INTEREST_RATE = 3.5; // syntax ALL_UPPERCASE_AND_UNDRSCORE

        double loanAmount = 16356;

//        INTEREST_RATE = 5.6;

        System.out.println("The yearly interest rate is: "  + loanAmount * (INTEREST_RATE/100));

        System.out.println(Math.PI);


    }
}
