package day16;

import java.util.Random;
import java.util.Scanner;

public class DailyAffirmationGenerator {


    /**
     * Task: Daily Affirmation Generator
     * Background:
     * To promote a positive mindset, a life coach asks for a simple Java program to give clients a daily affirmation.
     * Objective:
     * Create a program that presents a user with a positive affirmation from a set list each time they run the program.
     * Steps:
     * Create a new Java class named DailyAffirmationGenerator.
     * In the main method:
     * Initialize an array of strings with various affirmations (e.g., "I am confident," "I believe in my skills," etc.).
     * Generate a random index and select an affirmation from the array.
     * Display the selected affirmation to the user.
     */

    public static void main(String[] args) {


        String[] affirmations = {"I am confident", "I believe in my skills",
                "I am in the right place at the right time, doing the right thing",
                "I am worthy of success",
                "I embrace positivity",
                "I am complete as I am, others simply support me.",
                "I am growing and I am going at my own pace."};




        String answer;
        do{
            int randIndex = new Random().nextInt(affirmations.length);
            System.out.println("Daily Affirmation: " + affirmations[randIndex]);
            System.out.println("Do you want to repeat? (yes/no)");
            answer = new Scanner(System.in).next();
        }while (answer.equalsIgnoreCase("yes"));
    }


}
