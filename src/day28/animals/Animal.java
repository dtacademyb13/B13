package day28.animals;

public class Animal {

    int age;
    double weight;
    String color;

    private int lifeExpectancy;

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void move(){
        System.out.println("Moving");
    }

    public void hunt(){
        System.out.println("Hunting");
    }


    // Another name for Inheritance IS-A relationship
    // Inheritance can be built in 3 ways:
     // a) Single Inheritance:  Animal -> Dog
    //  b) Hierarchical Inheritance: Animal :  Dog, Bear, Fox
    //  c) MultiLevel Inheritance: Animal -> Dog -> Husky

    // Multiple Inheritance (when a class inherits from multiple parents) is NOT possible with classes in Java
    // but it can be implemented with INTERFACES
}
