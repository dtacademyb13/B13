package day32;

import java.util.Random;

public class TestCar {


    public static void main(String[] args) {




        Car[] cars = new Car[100];

        String[] makes = {"Toyota", "Honda", "Nissan", "Ford", "Tesla"};
        String[] models = {"Tercel", "Altima", "Model 3", "Civic", "F150"};


        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(
                     makes[new Random().nextInt(makes.length)],
                    models[new Random().nextInt(models.length)],
                     new Random().nextInt(200));
        }

        for (Car car : cars) {
            System.out.println(car);
        }



        // Check for duplicate cars


        for (int i = 0; i < cars.length-1; i++) {
            for (int j = i+1; j < cars.length ; j++) {
                 Car car1 = cars[i];
                 Car car2 = cars[j];
                if(car1.equals(car2)){
                    System.out.println("Duplicates found: ");
                    System.out.println(cars[i]);
                    System.out.println(cars[j]);
                }
            }
        }




    }
}
