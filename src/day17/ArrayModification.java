package day17;

import java.util.Arrays;

public class ArrayModification {

    public static void main(String[] args) {


//        int[] arr = {1,2,3,-4,-5,-6,7,8,9};
//
//        // Modify the array by negating the values
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= -1;
//        }
//
//        System.out.println(Arrays.toString(arr));
        double[] arr = {1.0, 2.0,3.4, 4.5};

        String[] arr2 = new String[0];

        System.out.println(Arrays.toString(arr2));

        getSum(arr);
       // getSum({1.0, 2.0,3.4, 4.5});
        System.out.println(getSum(new double[] {1.0, 2.0,3.4, 4.5}));


        String[] names = splitFullName("Jose Garcia Abelardo");

        System.out.println(Arrays.toString(names));
        System.out.println(names[0].toUpperCase());
        System.out.println(names[1].toLowerCase());
        System.out.println(names[2].substring(1));

    }


    public static double getSum(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }


    public static String[] splitFullName(String fullName){
        return fullName.split(" ");
    }


}
