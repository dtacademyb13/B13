package day04;

public class Change {

    public static void main(String[] args) {

        //Calculate the change
        int cents = 39;
        System.out.println(cents / 25 + " quarters");

//        System.out.println( cents % 25 + " remaining");

        cents = cents % 25;

        System.out.println(cents / 10 + " dimes");

//        System.out.println( cents % 10 + " remaining");

        cents = cents % 10;

        System.out.println(cents / 5 + " nickels");
        System.out.println( cents % 5 + " pennies");
    }
}
