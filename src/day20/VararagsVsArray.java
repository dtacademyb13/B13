package day20;

import java.util.Arrays;

public class VararagsVsArray {


    public static void main(String[] args) {




        printVarargs("a", "b", "c"); //varags can accept individual values
        printVarargs(new String[]{"a", "b", "c"}); //varags can also accept an array

//        printArr("a", "d", "f"); //array cannot accept individual values
        printArr(new String[]{"a", "b", "c"}); //arrays can only accept an array

    }

    public static void printVarargs(String... args){
        System.out.println(Arrays.toString(args));

    }

    public static void printArr(String[] args){
        System.out.println(Arrays.toString(args));

    }


   





}
