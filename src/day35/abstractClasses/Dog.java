package day35.abstractClasses;

import day35.interfaces.Commercializable;

//public class Dog extends Animal, Canine{ //Class cannot extend multiple classes
public class Dog extends Animal implements Commercializable { //Class cannot extend multiple classes
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void move() {
        System.out.println("Dog jumps");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog woofs");
    }

    @Override
    public void makeMoney() {

    }
}
