package day25;

import java.util.Scanner;

public class FitnessCenterManager {


    /*
    Main Method Logic:
Initialize an array of Member objects.
Enter a loop that allows users to add new members, update existing members' details, or view the current membership list.
For each member:
Prompt the user to enter the name, subscription type, and active status.
Create a new Member object and add it to the array.
Provide options to display all members in the list or update an existing member's details.
Exit the program upon user request.
     */

    public static void main(String[] args) {

        System.out.println("Welcome to Fitness Center Member Management App!");

        Member[] members = new Member[5];
        Scanner scanner = new Scanner(System.in);
        int choice;
        int i = 0;
        do{
            System.out.println("1. Add a new member.\n2. Update member. \n3. View current members\n4.Exit");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    if(i < members.length){
                        System.out.println("Enter the name:");
                        String name = scanner.next();
                        System.out.println("Enter the age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter the subscription type:");
                        String subs = scanner.next();
                        members[i] = new Member(name, age, subs);
                        i++;
                        System.out.println("Member successfully added.");
                    }else{
                        System.out.println("Can't add any more members");
                    }

                    break;

                case 2:
                          break;
                case 3:
                    System.out.println("The members list: ");
                    for (Member member : members) {
                        if(member != null){
                            System.out.println(member.getInfo());
                        }

                    }
                    break;
                case 4:
                    System.out.println("Thanks, Goodbye!");
                    break;

            }
        }while (choice !=4);

    }
}
