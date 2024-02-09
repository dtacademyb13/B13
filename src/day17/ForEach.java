package day17;

import java.util.Arrays;

public class ForEach {


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

//        for (int i = 5; i < nums.length-2; i++) {
//            System.out.println(nums[i]);
//        }


//        for (int el : nums){
//            System.out.println(el*10);
//        }

        // 2 scenarios when For each cannot be used:
        // - when you want to iterate partially or in reverse direction
        //   or in general any operation that requires an index is not possible with for each
        // - when you want to modify the array/collection content because the for each loop  variable is
        //   a copy of the element so updating the variable only updates the copy



        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            num = num * 10;
        }

//        for (int num : nums) {
//            num = num * 10;
//            System.out.println(num);
//        }

        System.out.println(Arrays.toString(nums));

        double[] prices = {12000, 34567, 23000,  78000, 35000, 45000};

        for (double price : prices) {
            if(price > 25000 && price < 50000){
                System.out.println(price);
            }
        }


//        Find max

        double max = Double.MIN_VALUE;
        for (double price : prices) {
            if(price > max){
                max = price;
            }
        }

        System.out.println("The max " + max);

        double min = Double.MAX_VALUE;
        for (double price : prices) {
            if(price < min){
                min = price;
            }
        }

        System.out.println("The max " + min);




    }
}
