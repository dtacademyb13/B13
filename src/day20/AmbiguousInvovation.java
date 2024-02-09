package day20;

public class AmbiguousInvovation {


    public static void main(String[] args) {

        add(2, 5.6);
        add (2.4, 4);

//         add (2,3);  // ambiguous call matches both methods at the same time
        // to resolve it, remove the ambiguity and call the method with more precise arguments
//
    }
//

    public static double add(int a, double b){
        return a+b;
    }


    public static double add(double a, int b){
        return a+b;
    }





}
