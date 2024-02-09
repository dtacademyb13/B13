package day36;

import java.util.List;

public class FunctionalProgramming {


    public static void main(String[] args) {



        List<Integer> nums = List.of(1,2,3,4,5,6);


//        for (Integer num : nums) {
//            System.out.println(num * num);
//        }

        nums.forEach( num -> {System.out.println(num * num);} );
    }
}
