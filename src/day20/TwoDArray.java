package day20;

import java.util.Arrays;

public class TwoDArray {


    public static void main(String[] args) {


        int[][] arr = new int[3][5];

//        for (int[] row : arr) {
//            System.out.println(Arrays.toString(row));
//        }

        System.out.println(Arrays.deepToString(arr));


        System.out.println(Arrays.toString(arr[0]));

        arr[0][1] = 45;

        System.out.println(Arrays.toString(arr[0]));

        arr[1] = new int[]{8};

        System.out.println(Arrays.deepToString(arr)); //ragged arrays


        // Store database table info on 2 d array

        String[][] customers =  new String[][]{
                {"1", "Homer", "Simpson", "13/06/2014"},
                {"2", "Peter", "Griffin", "13/06/2019"},
                {"3", "Stewie", "Griffin", "13/04/2024"},
                {"4", "Marge", "Simpson", "12/08/2014"}
        };

        System.out.println("The info about customer with id 4: " + Arrays.toString(customers[3]));
        System.out.println("The last name of  customer with id 4: " + customers[3][2]);







    }
}
