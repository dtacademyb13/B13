package day39.exceptions;

public class RunTimeExceptionClasses {


    public static void main(String[] args) {


//        int i = Integer.parseInt("34$");

        Object o =  new String();

        Integer integer = (Integer)o; // ClassCastException


    }
}
