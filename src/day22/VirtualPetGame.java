package day22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetGame {

    /*
    VirtualPetSimulator Main Method Logic:
Initialize a Scanner object to read input from the console.
Prompt the user for their pet's name.
Create a VirtualPet object named myPet using the name provided by the user.
Set the initial hunger and happiness levels for myPet using the constructor.
Enter a loop that will continue until the user decides to exit:
Prompt the user for what they would like to do (feed, play, status, exit).
Use a switch-case or if-else statements to handle the input commands:
If 'feed', call the feed() method on myPet.
If 'play', call the play() method on myPet.
If 'status', call the status() method on myPet.
If 'exit', print a goodbye message and terminate the loop.
For any other input, prompt the user again.
After exiting the loop, close the Scanner object.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Pet Simulator!\n" +
                "What is your pet's name? ");
        String name = scanner.next();

        VirtualPet virtualPet = new VirtualPet(name);

        System.out.println("VirtualPet called " + name + " is created.");

        String userResponse;
        do{
            System.out.println("What would you like to do? (feed/play/status/exit): ");
            userResponse = scanner.next();

            switch (userResponse){

                case "feed":
                    virtualPet.feed();
                    break;
                case "play":
                    virtualPet.play();
                    break;
                case "status":
                    virtualPet.status();
                    break;
                case "exit":
                    System.out.println("Thanks for playing VirtualPet, Goodbye!");
                    break;
                default:
                    System.out.println("Invalid operation. Please choose one of the following, (feed/play/status/exit): ");
            }




        }while(!userResponse.equals("exit"));

    }
}
