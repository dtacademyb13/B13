package day16;

import java.util.Arrays;

public class ArrayIteration {


    public static void main(String[] args) {

        String[] affirmations = {"I am confident", "I believe in my skills",
                "I am in the right place at the right time, doing the right thing",
                "I am worthy of success",
                "I embrace positivity",
                "I am complete as I am, others simply support me.",
                "I am growing and I am going at my own pace."};

        // iterate and access each element and perform some operation

        for (int i = 0; i < affirmations.length; i++) {
            System.out.println(affirmations[i].toUpperCase());
        }

        System.out.println(Arrays.toString(affirmations));


        // modify array content

        for (int i = 0; i < affirmations.length; i++) {
            affirmations[i] =  affirmations[i].substring( affirmations[i].length()-4);
        }

        System.out.println(Arrays.toString(affirmations));


        int[] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 100;
        }

        System.out.println(Arrays.toString(arr));


    }
}
