package day19;

import java.util.Arrays;
import java.util.Random;

public class TwoDArrayOps {

    public static void main(String[] args) {


        int[][] arr =  new int[10][12];



//        System.out.println(Arrays.deepToString(arr));

//

        // Assign random value to each element

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = new Random().nextInt(100);
            }
        }

        for (int[] row: arr){
            for(int cell: row){
                System.out.print(cell + "\t");
            }
            System.out.println();
        }





    }
}
