package day34.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HealthcareProfessionalsManagementApp {


    public static void main(String[] args) {




        List<HealthcareProfessional> healthcareProfessionalList = new ArrayList<>();

        System.out.println("Welcome to the HealthcareProfessionalsManagementApp!");



        Scanner input = new Scanner(System.in);
        int userInput;

        do{
            System.out.println("1. Add a new Professional.\n2. Remove a Professional.\n3. Display All Professionals.\n4. Exit ");
            userInput = input.nextInt();



            switch (userInput){

                case 1:
                    System.out.println("1. Doctor.\n2. Nurse.\n3. Technician.");
                    int choice = input.nextInt();

                    System.out.println("Enter the details: ");
                    System.out.println("Name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Experience: ");
                    int experience = input.nextInt();

                    switch (choice){

                        case 1:
                            System.out.println("Specialization: ");
                            String special = input.next();
                            healthcareProfessionalList.add(new Doctor(name, experience,special));
                            break;
                        case 2:
                            System.out.println("Department: ");
                            String dept = input.next();
                            healthcareProfessionalList.add(new Nurse(name, experience,dept));
                            break;
                        case 3:
                            System.out.println("Please enter the list of tools (Use commas): ");
                            String[] tools = input.next().split(",");
                            List<String> list = Arrays.asList(tools);
                            healthcareProfessionalList.add(new Technician(name, experience,list));
                            break;
                    }
                    break;

                case 2:

                    System.out.println("Enter the name of the professional to be removed:");
                    String nameToBeRemoved = input.next();
                    int index = -1;

                    for (int i = 0; i < healthcareProfessionalList.size(); i++) {
                        HealthcareProfessional healthcareProfessional = healthcareProfessionalList.get(i);
                        if(healthcareProfessional.getName().equals(nameToBeRemoved)){
                            index = i;
                            break;
                        }
                    }
                    if(index == -1){
                        System.out.println("The person with the given name does not exist.");
                    }else{
                        healthcareProfessionalList.remove(index);
                    }

                    break;
                case 3:
                    System.out.println("The list of professionals:");
                    for (HealthcareProfessional healthcareProfessional : healthcareProfessionalList) {
                        System.out.println(healthcareProfessional);
                    }
                    break;

                default:
                    System.out.println("Invalid input");
                    break;


            }


        }while (userInput != 4);


        System.out.println("Bye!");






    }
}
