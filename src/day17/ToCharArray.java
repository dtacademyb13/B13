package day17;

import java.util.Arrays;

public class ToCharArray {


    public static void main(String[] args) {



        String str = "bottle";


        // converts a String into an array of chars
        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

//        Arrays.sort(charArray);
//
//        System.out.println(Arrays.toString(charArray));

        // reverse the array

        for (int i = 0, j = arr.length-1;  i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }



        System.out.println(Arrays.toString(arr));

        // Convert a char array to a String

//        String reversed = String.valueOf(arr); //valueOf
        String reversed = new String(arr); // use constructor

        System.out.println(reversed);


    }
}
