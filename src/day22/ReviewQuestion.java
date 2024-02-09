package day22;

import java.util.Arrays;

public class ReviewQuestion {

    /*

     {1,2,3}
     {4,5,6}
     {1,0,1} // row with min sum


  Returns:
     {1,0,1} // swapped with the first row values
     {4,5,6}
     {1,2,3}
     */


    public static void main(String[] args) {

       int[][] arr = {
               {5,2,3},

               {4,5,6},

               {-1,0,-10},

       };

//  Find the row that has a sum that is the smallest

        // Find the sum of the first row and assume that it is the MIN

        int sumOfFirst = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sumOfFirst+=arr[0][j];
        }
        System.out.println(sumOfFirst);


         int MIN = sumOfFirst;
         int minRowsIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            int sumOFCurrentRow = 0;

            for (int j = 0; j < arr[i].length; j++) {
                 sumOFCurrentRow+=arr[i][j];
            }
            // compare the sum of the current row against the min, if it is less, we found the new min
            if(sumOFCurrentRow< MIN){
                MIN = sumOFCurrentRow;
                minRowsIndex = i;
            }
        }

        System.out.println("The row index with min sum is: " + minRowsIndex);
        System.out.println("The row sum with min sum is: " + MIN);


    // swap the row with the min index with the first row values
        for (int j = 0; j < arr.length; j++) {
                 int temp =  arr[0][j];
                 arr[0][j] = arr[minRowsIndex][j];
                 arr[minRowsIndex][j] = temp;
        }

        for (int[] each : arr) {
            System.out.println(Arrays.toString(each));
        }





    }




    public static void swapArrayRows(int[][] arr){

 // instead of assuming the first element as MIN, we could use Integer.MIN_VALUE
        int MIN = Integer.MIN_VALUE;
        int minRowsIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            int sumOFCurrentRow = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sumOFCurrentRow+=arr[i][j];
            }
            // compare the sum of the current row against the min, if it is less, we found the new min
            if(sumOFCurrentRow< MIN){
                MIN = sumOFCurrentRow;
                minRowsIndex = i;
            }
        }


        // swap the row with the min index with the first row values
        for (int j = 0; j < arr.length; j++) {
            int temp =  arr[0][j];
            arr[0][j] = arr[minRowsIndex][j];
            arr[minRowsIndex][j] = temp;
        }


    }
}
