package day39.exceptions;

public class ErrorClasses {


    public static void main(String[] args) {


//        int[] arr =  new int[2000000000]; //OutOfMemoryError -> when java runs out of heap memory

        myMethod(); //StackOverflowError -> when a method calls itself infinitely

    }

    public static void myMethod(){
        myMethod(); //recursion
    }
}
