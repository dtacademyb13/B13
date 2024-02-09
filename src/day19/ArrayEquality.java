package day19;

import java.util.Arrays;

public class ArrayEquality {


    public static void main(String[] args) {


      int[] arr1 = {1,2,3};
      int[] arr2 = {1,2,3};

      // Never use equals method of an array or ==
      // BAD: System.out.println(arr1.equals(arr2));
        // BAD: System.out.println(arr1 == arr2);
      // it compares the memory location

        //Array equality should be checked through Arrays class's equals() method
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);




    }
}
