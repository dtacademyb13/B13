package day35.interfaces;

public interface Edible {

    public abstract void howToEat();

    // 2 main usage differences between abstract classes and interfaces:

//    1)
    // Abstract classes represent IS-A relationship (Dog is an Animal)
    // Interfaces represent CAN-DO relationship (Apple can be Edible)

//    2)
    //Abstract classes are limited to a single inheritance (Dog can only extend Animal class)
    //Interfaces support multiple inheritance, i.e. a class can implement multiple interfaces at a time (Apple can implement Edible and Commercializable interfaces)


}
