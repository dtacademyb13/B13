package day19;

import java.util.Arrays;

public class TwoDArray {


    public static void main(String[] args) {


        int[][] twoD =  new int[4][3];

//        int twoD1 [][];
//        int[] twoD2 [];

//        System.out.println(Arrays.deepToString(twoD));

        // Print out the content of 2 d array

        for (int[] each: twoD) {
            System.out.println(Arrays.toString(each));
        }

        // Accessing elements by index
        twoD[1][1] = 99;

        System.out.println("--------------------------");
        for (int[] each: twoD) {
            System.out.println(Arrays.toString(each));
        }

        int[][] arr =  new int[][]{
                {0,1,2,3,4},
                {2,3,4,5,6},
                {3,4,5,6,7},
        };

        // Length

        System.out.println(arr.length); // 3
        System.out.println(Arrays.toString(arr[1])); //  {2,3,4,5,6},
        System.out.println(arr[1].length); // 5


        // Iterate over a 2d array

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }










    }
}
