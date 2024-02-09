package day24;

import java.util.Arrays;

public class ReplitExample {


    public static void main(String[] args) {


        System.out.println(reverseStringStatic("Hello"));

        ReplitExample replitExample = new ReplitExample();
        System.out.println(replitExample.reverseStringInstance("Hello"));



        String str = new String("Java");
        str.substring(2); //instance methods require an object

        String strVersionOfInt = String.valueOf(45); //static methods do not require an object

        // Example of utility classes with all static methods

        Math.random();
        Math.abs(45);

        Arrays.sort(new int[]{1,2});
        Arrays.toString(new int[]{1,2});




    }


    public static String reverseStringStatic(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public String reverseStringInstance(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
