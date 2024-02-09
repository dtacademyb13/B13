package day31.animals;

public class Animal {

    String color;
    double weight;


    public Animal(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void move(){
        System.out.println("Generic animal movement");
    }


    public void eat(){
        System.out.println("Generic animal eating");
    }

    public void makeSound(){
        System.out.println("Generic animal sound");
    }

}
