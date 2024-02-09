package day22;

import java.util.Arrays;

public class REview2 {

    public static void main(String[] args) {

        int[][] arr = {
                {5,2,3},

                {4,5,6},

                {-1,0,-10},

        };


        int[][] newArr = swapArrayRows(arr);


        for (int[] eachRow : newArr) {
            System.out.println(Arrays.toString(eachRow));
        }

    }



    public static int[][] swapArrayRows(int[][] arr){

        // instead of assuming the first element as MIN, we could use Integer.MAX_VALUE
        int MIN = Integer.MAX_VALUE;
        int minRowsIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            int sumOFCurrentRow = 0; // gets the sum of the current row for each row

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


        return arr;
    }
}
