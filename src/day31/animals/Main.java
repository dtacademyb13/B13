package day31.animals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("black", 20);
//        Bird bird = new Bird("gray", 0.5, true);


        System.out.println("Enter an animal: ");
        String animalType =  new Scanner(System.in).next();

        Animal animal = null;
        if(animalType.equals("Bird")){
            animal = new Bird("gray", 0.5, true);
        }else if (animalType.equals("Snake")){
            animal = new Snake("black", 0.1, true);
        }

        animal.move();
        animal.makeSound();
        animal.eat();




    }
}
