package day18;

import java.util.Arrays;

public class BubbleSort2 {


    public static void main(String[] args) {



       int[] arr =  {-2,-4, 1,2,5,6,-4,2,-5,2};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                 if(arr[i] > 0){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
            }
//
        }

        System.out.println(Arrays.toString(arr));






    }
}
