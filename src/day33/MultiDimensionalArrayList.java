package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDimensionalArrayList {


    public static void main(String[] args) {

        int[][] arr = new int[2][4];

        System.out.println(Arrays.deepToString(arr));
        arr[1][2] = 23;

        System.out.println(Arrays.deepToString(arr));


        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> first = List.of(1,2,3);
        List<Integer> second = List.of(4,5,6);

        listOfLists.add(first);
        listOfLists.add(second);

        System.out.println(listOfLists);

        System.out.println(listOfLists.get(1).get(2));

        // List of Lists is typically used to store table data

    }
}
