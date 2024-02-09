package day20;

import java.util.Arrays;
import java.util.Random;

public class OverloadedMethodExamples {

    public static void main(String[] args) {


        int i = new Random().nextInt(); // -2 bln - 2 bln
        int j = new Random().nextInt(10); //0 - 9

        String str = "hello";

        System.out.println(str.substring(1));
        System.out.println(str.substring(1,3));

        //Arrays


        Arrays.sort(new int[] {});

        System.out.println();
        System.out.println("dsds");
        System.out.println(34);
        System.out.println(new int[]{});


    }
}
