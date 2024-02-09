package day18;

import java.util.Arrays;

public class Binarysearch {


    public static void main(String[] args) {


         int[] arr = {12, 24, 25, 28, 29, 32, 45, 51, 57, 60, 67, 69, 69, 76, 82, 84, 90, 90, 90, 96};

        System.out.println( binarySearch(arr, 90));

        System.out.println( Arrays.binarySearch(arr, 90));
    }

    public static int binarySearch(int[] arr, int key){
        
        int start = 0;
        int end = arr.length-1;

        while(end >= start){

            int midIndex = (start + end) / 2;
            if(arr[midIndex] > key){
                end = midIndex -1;
            } else if (arr[midIndex] < key) {
                start = midIndex + 1;
            }else{
                return midIndex;
            }

        }

        return -1;


    }
}
