package day18;

import java.util.Arrays;

public class CopyArrays {

    public static void main(String[] args) {



        int a = 45;
        int b = 78;

        a = b;

        System.out.println(a);
        System.out.println(b);

        a = 100;

        System.out.println(a);
        System.out.println(b);

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        arr1 = arr2;


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1[0] = 32468;
//
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        int[] arr3 = new int[] {6,7,8};

        int[] arr4 = new int[] {1,1,1};

        // assignment for object assigns the reference rather than the actual
         arr3 = arr4;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        arr4[1] = 99;
        arr3[2] = 100;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));







    }
}
