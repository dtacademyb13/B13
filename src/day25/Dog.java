package day25;

public class Dog {


    String name;
    static String breed = "lab"; //static variables are usually initialized in the same place where declared

    public Dog(String name){
        this.name = name;
    }


     // static are usually used for initializing the static variables
    // static block is automatically run when the class is used
    // it is also used to execute some code before everything in the class
    static {
         System.out.println("Static block is called");
        breed = "Lab";
        Math.sqrt(45);
    }


}
