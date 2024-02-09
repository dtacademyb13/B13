package day24;

public class Dog {

    //




    // Java offers 4 visibility modifiers: public -> protected -> default -> private
    public String name; // public is visible everywhere (classes in the same package and outside the current package)
    int age; // default(package-private) visibility -> no visibility modifier ->
    private static String breed; // private is only visible within the class, it is not visible outside the class


    public Dog(){}  // can constructor be static? NO

    Dog(int age){}

    private Dog(String breed){}
    // private no-arg constructor is typically used in utulity classes with all static methods
    // where there is no need for object creation



    public void publicMethod(){}

    int defaultMethod(){  // default visibility
        return 6;
    }

    private static void privateMethod(){}




}
