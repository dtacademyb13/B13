package day31;

public class MyClass {


    // Regular classes cannot be static or private/protected


    // Inner class -> class that is declared inside another class
    // Inner classes can have any visibility or static keyword because they are considered a member


    private static class AnotherClass{

    }

    public static void main(String[] args) {

        Cat.main(new String[] {});
        // Main method's parameter is String[]
        // because when running the code through command line optional arguments can be passed as an array of Strings
        // which gives you flexibility on how you run your main method (how to start your application)
    }
}
