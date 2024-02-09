package day19;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {


    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        System.out.println(arr);

        String content = Arrays.toString(arr);
        System.out.println(content);

        System.out.println(Arrays.toString(arr));

        // Partial sort - sort the second half
        Arrays.sort( arr, arr.length/2, arr.length);

        System.out.println(Arrays.toString(arr));


        int[] arr1 = {11, 18, 21, 33, 40, 42, 60, 63, 67, 98};


        System.out.println(Arrays.binarySearch(arr1, 20));




        int[] arr2 = {0,0,0,0,0,0,0,0,0,0};

        Arrays.fill(arr2, 100);

        System.out.println(Arrays.toString(arr2));

        int[] newOne = Arrays.copyOf(arr2, arr2.length*2);
//        int[] newOne = Arrays.copyOf(arr2, 4);
//        int[] newOne = Arrays.copyOf(arr2, 20);

        System.out.println(Arrays.toString(newOne));

        int[] cloned = arr2.clone();

        System.out.println(Arrays.toString(cloned));

        System.out.println(arr2);
        System.out.println(newOne);
        System.out.println(cloned);






    }
}
