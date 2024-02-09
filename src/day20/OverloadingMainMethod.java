package day20;

public class OverloadingMainMethod {


    // It is possible to overload the main method but it is not going to be a runnable method
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    public static void main(int args) {
        System.out.println("Overloaded main Method");
    }



}
