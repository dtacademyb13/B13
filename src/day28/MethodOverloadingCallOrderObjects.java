package day28;

import java.util.Scanner;

public class MethodOverloadingCallOrderObjects {


    public static void main(String[] args) {

        Object object = new Object();

        sort(new Scanner(System.in));

        // if there is no exact match with objects, the next preference is for its parent class type
        // Object is the parent of all classes
    }


//    public static void sort(String num){
//
//        System.out.println("String");
//    }

    public static void sort(Object num){
        System.out.println("Object");
    }








}
