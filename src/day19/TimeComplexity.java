package day19;

import java.util.Arrays;

public class TimeComplexity {

    //Time Complexity - the efficiency of the algorithm


    public static void main(String[] args) {


        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        arr[arr.length-1] = 1000000;
        arr[arr.length-2] = 1000000;

        System.out.println(Arrays.toString(arr));

        long start = System.currentTimeMillis();
        System.out.println(containsDuplicateNestedForLoop(arr));
//        System.out.println(containsDuplicateSortFirst(arr));
        long end = System.currentTimeMillis();
        System.out.println("The execution time is " + (end -start) + " milliseconds");



        String[] names = {"Bob", "Alice", "Jake"};

        System.out.println(containsDuplicate(names));



    }



    public static boolean containsDuplicateNestedForLoop(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1 ; j < nums.length; j++){

                if (nums[i] == nums[j]){
                    return true;

                }
            }
        }




        return false;
    }

    public static boolean containsDuplicateSortFirst(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
        // implement the solution here
    }

    public static boolean containsDuplicate(String[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i].equals(nums[i+1])){
                return true;
            }
        }
        return false;
        // implement the solution here
    }
}
