package day22;

public class Cat {


    String breed ;
    String color;
    int noOfLives;

//    public Cat(){
//
//    }

    // Constructor
    // - looks like a method, but without return type
    // - needs to have the same name as the class
    // - its purpose is to initialize the object with initial values
    // - it is called implicitly when an object is created

    public Cat(String newBreed, String newColor, int newNoOfLives ){
         breed = newBreed;
         color = newColor;
         noOfLives = newNoOfLives;
    }



    public void printInfo(){
        System.out.println( "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", noOfLives=" + noOfLives +
                '}');
    }

}
