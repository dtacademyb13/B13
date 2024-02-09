package day31.animals;

public class Bird extends Animal{

    boolean migrates;

    public Bird(String color, double weight, boolean migrates) {
        super(color, weight);
        this.migrates = migrates;
    }


//    public void move(){
//        System.out.println("Bird is flying");
//    }
//
//
//    public void eat(){
//        System.out.println("Bird is eating a worm");
//    }
//
//    public void makeSound(){
//        System.out.println("Bird is chirping");
//    }
}
