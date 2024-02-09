package day35.abstractClasses;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("Bird eats worms");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}
