package day20;

public class Calculator {


    // Method overloading - creating a method in the same class, with the same name and different parameters
    // Parameters could be different in  type, order, count

    // For overloading, the only two things that matter are - name and paramaters of the method
    // Anything else such as method return type, visibility and ststic/non-static do not matter


    public static int add(int a, int b){
        return a+b;
    }

    // overloading by changing the type of params
    public static double add(double a, double b){
        return a+b;
    }

    // overloading by changing the number of params
    public static int add(int a, int b, int c){
        return a+b+c;
    }


    public static float add (long a, float b){
       return  a+b;
    }

    // overloading by changing the order of params
    public static float add (float a, long b){
        return  a+b;
    }


//    private double add (float hello, long hi){
//        return  hello + hi;
//    }
}
