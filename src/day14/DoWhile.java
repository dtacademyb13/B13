package day14;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        System.out.println("Simple guessing game:");
        int generated = new Random().nextInt(11);
        int number;

        do{
            System.out.println("Enter a number");
            number  = new Scanner(System.in).nextInt();
        }while (number != generated);


        System.out.println("You found it " + generated);


    }
}
