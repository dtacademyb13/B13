package day18;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {



       int[] arr =  {29, 24, 84, 28, 69, 90, 12, 76, 82};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                 if(arr[i] > arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
            }
//            System.out.println(Arrays.toString(arr));
        }

        // O(n2) -> O of N squared -> using nested loops to find the duplicate
        // O (n) -> O of N -> passing through an array once


        System.out.println(Arrays.toString(arr));



        int[] arr2 =  {29, 24, 84, 28, 69, 90, 12, 76, 82};

        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));





    }
}
