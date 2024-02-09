package day30;

import java.util.Random;

@MyAnnotation
//@Override
public class Shiba extends Dog{

    // Subclass can re-declare the same variables in the superclass
    double weightShiba = 40;


    public void printInfo(){
        System.out.println(this.weight); // 40
        System.out.println(weight); //40
        System.out.println(super.weight); // 20
    }

   @MyAnnotation
    String color;

    public Shiba(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void myMethod(){

    }

    @MyAnnotation
    public void anotherMethod(){

    }

    public static String createShibaName(){
        String[] names = {"Hello", "World", "Java"};
        return names[new Random().nextInt(names.length)];
    }


//     subclass can re-declare the same method from superclass
//     it will be an independent method
    private int generateDogID(){
        System.out.println("Shiba's private method");
        return 9;
    }


    @Override
    public String toString() {
        return "Shiba{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                "} ";
    }

//    dogSpecificMethod()' cannot override 'dogSpecificMethod()' in 'day30.Dog'; overridden method is final
//    public void dogSpecificMethod(){
//
//    }

    public final void anotherSuperclassMethod(){

    }


    public static void main(String[] args) {

//         private int i = 90;
//         static int i = 90;
// local variables cannot be static/non-static or have visibility modifiers

        final int j = 8;
//        j = 9;
        final  Shiba shiba = new Shiba("Rex", "Black");
        System.out.println(shiba.toString());
        shiba.generateDogID();
//        shiba = new Shiba("Rex", "Black");


        // Call Dog class's static method
        System.out.println(Dog.createDogName());
        // Call Shiba class's static method
        System.out.println(Shiba.createDogName());


        // final can be used in 3 ways:
        // variables: prevents re-assignment, makes the variable a constant
        // methods: prevents overriding
        // classes: prevents extension, inheritance

        final int PI = 8;

        shiba.printInfo();

        //


        // In Java, private methods,static methods, final methods, variables(instance/static) cannot be overridden.
        // The term that is related to all of these scenarios is called hiding.
        // For example, subclass static method hides super class's static method with the same name and parameters
        // Or subclass variable hides the superclass's variable with the same name, etc


    }
}
