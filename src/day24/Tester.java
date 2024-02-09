package day24;

import day16.ArrayDemo;

import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {

        Demo.myStaticMethod();

//        Demo demo = new Demo();
//        demo.myInstanceMethod();

        new Demo().myInstanceMethod();

//        StringUtility stringUtility = new StringUtility();  //prevent object creation
        StringUtility.reverseString();
        StringUtility.capitalizeEachWord();

//        Math math = new Math();
        Math.random();

//        Arrays arrays = new Arrays();
        Arrays.toString(new int[]{});

    }
}
