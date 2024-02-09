package day12;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop2 {


    public static void main(String[] args) {


        System.out.println("Coin Toss Game");
        Scanner scanner = new Scanner(System.in);

        int randomNo =  new Random().nextInt(2);
        System.out.println("The coin toss result is " + (randomNo == 0 ? "HEADS" : "TAILS") );
        System.out.println("Do you want to repeat? yes/no:");
        String answer = scanner.next();

        while(answer.equals("yes")){
            randomNo =  new Random().nextInt(2);
            System.out.println("The coin toss result is " + (randomNo == 0 ? "HEADS" : "TAILS") );
            System.out.println("Do you want to repeat? yes/no:");
            answer = scanner.next();
        }

        System.out.println("Thanks for playing the game");


    }
}
