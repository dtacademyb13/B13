package day17;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {



       String[] arr = {"I" , "love", "Java"};

        for (int i = 0, j = arr.length-1;  i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }



        System.out.println(Arrays.toString(arr));




    }
}
