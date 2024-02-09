package day19;

import java.util.Arrays;

public class TwoDWithInnerArraySizeOmitted {


    public static void main(String[] args) {



        int[][] arr = new int[5][];  // omit the inner array size


        System.out.println(Arrays.deepToString(arr));

        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{1,2,3,4};
        arr[2] = new int[]{1,2,3,4,5};
        arr[3] = new int[]{1,2,3,4,5,6};
        arr[4] = new int[]{1,2,3,4,5,6,7};

        System.out.println(Arrays.deepToString(arr));

        arr[0] = new int[] {0,0,0,0,0};

        System.out.println(Arrays.deepToString(arr));
    }
}
