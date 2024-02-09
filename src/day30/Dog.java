package day30;

import java.util.Random;

//public final class Dog {
public class Dog {

    double weight = 20;
    String name;

    public Dog(String name) {
        this.name = createDogName();
    }

    protected void myMethod(){

     }
     // private methods are not inherited
    // and cannot be overriden
    // None of the overriding rules apply to private methods
     private void generateDogID(){
         System.out.println("Dog's private method");
     }

     public static String createDogName(){
        String[] names = {"Rex", "Coco", "Chanel", "Beethoven", "Mozart"};
        return names[new Random().nextInt(names.length)];
     }
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void dogSpecificMethod(){
        System.out.println("A very specific implementation that the author does not want to change");
    }

    public void anotherSuperclassMethod(){

    }


}
