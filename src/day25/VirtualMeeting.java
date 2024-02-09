package day25;

import day24.Snake;  // regular imports are for importing classes from external packages
import day24.StringUtility;
//import day24.StringUtility; // imports the class
import java.util.ArrayList;
import java.util.Collections;

//import static java.util.Arrays.*;

//import static day24.StringUtility.reverseString; // static import imports the static members (methods and variables) of the class
//import static day24.StringUtility.capitalizeEachWord; // static import imports the static members (methods and variables) of the class
import static day24.StringUtility.*; // static import imports the static members (methods and variables) of the class
import static day24.DuotechStudent.getNo0fStudentObjects; // static import imports the static members (methods and variables) of the class

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.reverse;


public class VirtualMeeting {


    public static void main(String[] args) {


         Dog dog = new Dog("dsd");

         Snake snake = new Snake();

         reverseString();
         capitalizeEachWord();

        System.out.println(THOUSAND);

        System.out.println(getNo0fStudentObjects());

        sort(new int[]{});
        binarySearch(new int[]{}, 2);
        fill(new int[]{}, 2);

        System.out.println(PI);
        random();
        sqrt(67);
        max(3,4);


        reverse(new ArrayList<>());





    }
}
