package day18;

import java.util.Arrays;
import java.util.Random;

public class Linearsearch {


    public static void main(String[] args) {


         int[] arr = {29, 24, 84, 28, 69, 90, 90, 96, 45, 57, 25, 32, 69, 60, 51, 67, 12, 90, 76, 82};

        System.out.println(linearSearch(arr,12));
    }

    public static int linearSearch(int[] arr, int key){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key){
                return i;
            }
        }

        return -1;


    }
}
