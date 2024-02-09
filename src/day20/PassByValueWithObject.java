package day20;

import java.util.Arrays;

public class PassByValueWithObject {




    public static void main(String[] args) {

        int[] myArr = {1,2,3};
        changeArr(myArr);
        System.out.println("In the main: " + Arrays.toString(myArr));

        // pass by value for mutable objects works by passing the copy of the object reference
        // So if the copy of the reference in the method changes the object, the original object is also changed
        // Since both references are pointing to the same object


    }


    public static void changeArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }
    }



}
