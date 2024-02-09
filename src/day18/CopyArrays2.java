package day18;

import java.util.Arrays;

public class CopyArrays2 {

    public static void main(String[] args) {



        int[] arr1 =  new int[]{1,3,4};
        int[] arr2 =  new int[]{2,3,5};

        System.out.println(arr1);
        System.out.println(arr2);

//        arr1 = arr2;

        for (int i = 0; i < arr1.length; i++) {
             arr2[i] = arr1[i];
        }

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1[0] = 99;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));











    }
}
