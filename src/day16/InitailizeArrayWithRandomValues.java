package day16;

import java.util.Arrays;
import java.util.Random;

public class InitailizeArrayWithRandomValues {

    public static void main(String[] args) {


        int[] arr = new int[1000];

        System.out.println(Arrays.toString(arr));

        // Initialize array with random values between 0-100


        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(101);
        }
        System.out.println(Arrays.toString(arr));




    }
}
