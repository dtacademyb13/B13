package day13;

import java.util.Random;

public class AccumulatorLoop4 {

    public static void main(String[] args) {


        System.out.println(getRandomString(100));


    }


    public static String getRandomString(int length){

        String str = "";

         int i = 0;
         while( i < length){
            char ch =  (char)('a' + new Random().nextInt(26));
             str = str + ch;
             i++;
         }

         return str;


    }
}
