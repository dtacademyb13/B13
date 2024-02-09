package day13;

import java.util.Scanner;

public class DoWhileDemo3 {


    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        int choice;
       // Do while is often useful when you need to FIRST get the user input and THEN check the input is equal to some value

        do {
            System.out.println("Choose\n1.Checking\n2.Savings\n3.Print Statement");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);

        System.out.println("You chose " + choice);




    }
}
