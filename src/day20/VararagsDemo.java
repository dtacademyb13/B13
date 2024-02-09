package day20;

import java.util.Arrays;

public class VararagsDemo {


    public static void main(String[] args) {

        add(2,3);
        add(2,3,5);
        add(2,3,5,4,5,6,7);
        add();
        add(1,2,3,4,5,6,7,7,8,9,10);

        int[] arr;
//        int... arr2; // varargs can only be used in method parameters

//         print("Hi", "Hello");
//         print("Hi");

    }

    public static void print(String str, String... args){
        System.out.println(str);
        System.out.println(Arrays.toString(args));

    }

//    public static int add(int a, int b){
//        return a+b;
//    }
//
//    public static int add(int a, int b, int c){
//        return a+b+c;
//    }

    public static void add (int... args){  // varargs

        int sum = 0;
        for (int each : args) {
            sum += each;
        }
        System.out.println(sum);

    }


//    public static void print(String... args, int i){
//Vararg parameter must be the last in the list of paramaters
//    public static void print(int... arr, String... args){



}
