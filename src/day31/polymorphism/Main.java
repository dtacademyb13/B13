package day31.polymorphism;

public class Main {


    public static void main(String[] args) {

       // Reference type       // Actual Object
       // Declared type      // Actual type
//        Object object   =  new String("Java");
//        Object object   =  new Student("Bob", "VA");
        Object object   =  new OnlineStudent("Bob", "VA", "VA123");
        System.out.println(object.toString());

        // In polymorphism, the actual type (the actual object that is being assigned to a reference)
        // determines which version of the overridden method is called.


    }
}
