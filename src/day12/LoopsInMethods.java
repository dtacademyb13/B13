package day12;

import day05.RandomMethod;

import java.util.Random;

public class LoopsInMethods {


    public static void main(String[] args) {




        printRandomNumberBetween1and10(1000000);


    }


    public static void printRandomNumberBetween1and10(int amount){
        int i = 0;
        while(i < amount){
            System.out.println(new Random().nextInt(10));
            i++;
        }

    }
}
