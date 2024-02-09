package day28;

public class MethodOverloadingCallOrder2 {

//    public static void sort(int num){
//
//        System.out.println("int");
//    }

//    public static void sort(long num){
//
//        System.out.println("long");
//    }

    public static void sort(short num){

        System.out.println("short");
    }

//    public static void sort(Integer num){
//
//        System.out.println("Integer");
//    }

    public static void sort(Long num){

        System.out.println("Long");
    }

    public static void sort(int... num){
        System.out.println("int varargs");
    }





    public static void main(String[] args) {

        sort(3);




    }






}
