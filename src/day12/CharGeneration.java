package day12;

import java.util.Random;

public class CharGeneration {


    public static void main(String[] args) {


        printRandomChars(10000);
    }


    public static void printRandomChars(int times){

            int count = 0;
            while( count < times) {
                char ch =  (char)('A' + new Random().nextInt(26) );
                System.out.print(ch);
                count++;
            }


    }
}
