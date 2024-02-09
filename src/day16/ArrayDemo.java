package day16;

import java.util.Arrays;

public class ArrayDemo {


    public static void main(String[] args) {


        int num;

        // declaring arrays
        int[] nums;
        double[] temps;
        String[] lastNames;

        // alternative syntax

        int numbers [];

        // Initializing

        int[] arr = new int[10];  // array size has to be provided while creating

        System.out.println(arr); //printing an array directly will show the memory address [I@e9e54c2

        System.out.println(Arrays.toString(arr)); // prints the actual content of the array

        // Accessing elements and assign values

         arr[0] = 56;
         arr[3] = 12;
         arr[9] = 22;

        System.out.println(Arrays.toString(arr));

//        arr[10] = 89; //ArrayIndexOutOfBoundsException
//        arr[-2] = 67; //ArrayIndexOutOfBoundsException
//        arr[123] = 67; //ArrayIndexOutOfBoundsException

//        arr[0] = 5.7;
//        arr[0] = "57";
        arr[0] = 'a';

        System.out.println(Arrays.toString(arr));

        double[] arr2 = new double[2];
        arr2[0] = 78;

        System.out.println(Arrays.toString(arr2));

        // default values

        char[] chs = new char[5];
        System.out.println(Arrays.toString(chs)); //[ ,  ,  ,  ,  ]

        boolean[] bools = new boolean[4];
        System.out.println(Arrays.toString(bools));  //[false, false, false, false]

        String[] names = new String[7];
        System.out.println(Arrays.toString(names)); //[null, null, null, null, null, null, null]

        Character[] chars = new Character[3];
        System.out.println(Arrays.toString(chars)); //[null, null, null]


        System.out.println(Arrays.toString(arr));

        System.out.println(arr[3] + arr[3] + arr[3]);
        System.out.println(arr[3] * arr[9]);

        // Length of the array

        int length = arr.length; // length is a property of an array but not a method

        System.out.println(arr[arr.length-1]); // access the last element dynamically


        String[] first = new String[3];
        first[0] = "Bob";
        first[1] = "Alice";
        first[2] = "Jane";

        System.out.println(first[1].substring(0, 2).toUpperCase());

        // Shorthand array creation syntax


        int[] arrayNum = {1,2,3,4,56,6,7,3,453,35};
        System.out.println(Arrays.toString(arrayNum));

        String[] last = {"Smith", "Jones", "Jackson"};
//        String[] last;
//        last = {"Smith", "Jones", "Jackson"}; doesn't work

        //alternative shorthand syntax
        int[] arrayNum2;
        arrayNum2 = new int[]{1,2,3,4,56,6,7,3,453,35};

        String[] last2 = new String[]{"Smith", "Jones", "Jackson"};





    }
}
