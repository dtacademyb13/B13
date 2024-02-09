package day35.abstractClasses;

import day35.abstractClasses.Animal;
import day35.abstractClasses.Bird;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Bird();

        animal.eat();
        animal.move();
        animal.makeSound();

    }
}
