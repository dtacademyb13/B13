package day31.task;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("How many vehicles do you want to create?: ");
        Scanner input = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[input.nextInt()];



        for (int i = 0; i < vehicles.length; i++) {

//            Display a choice of vehicle for a user

            System.out.println("--------------------------------------");
            System.out.println("Adding vehicle no " + (i+1) + "...");
            System.out.println("Please choose the type of the vehicle:");
            System.out.println("1. Car\n2. Truck\n3. Motorcycle");

            int choice = input.nextInt();


            System.out.print("Make: ");
            String make =  input.next();
            System.out.print("Model: ");
            String model =  input.next();
            System.out.print("Year: ");
            Integer year =  input.nextInt();
            System.out.print("Top Speed: ");
            Integer topSpeed =  input.nextInt();


            switch (choice){

                case 1:
                    System.out.print("Num Of Doors: ");
                    Integer noOfDoors =  input.nextInt();
                    vehicles[i] = new Car(make,model, year,topSpeed,noOfDoors);
                    break;

                case 2:
                    System.out.print("Cargo capacity: ");
                    Integer capacity =  input.nextInt();
                    vehicles[i] = new Truck(make,model, year,topSpeed,capacity);
                    break;

                case 3:
                    System.out.print("Has Sidecar? (true/false): ");
                    Boolean hasSidecar =  input.nextBoolean();
                    vehicles[i] = new Motorcycle(make,model, year,topSpeed,hasSidecar);
                    break;


            }


        }


        System.out.println("Here are the vehicles that you added...");

        for (Vehicle vehicle : vehicles) {
           vehicle.drive();
        }





    }
}
