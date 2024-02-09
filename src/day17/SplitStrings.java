package day17;

import java.util.Arrays;

public class SplitStrings {


    public static void main(String[] args) {


        String text = "Now principles discovered off increasing how reasonably middletons men";

        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Reverse the word order in this sentence

        for (int i = 0, j = words.length-1;  i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        System.out.println(Arrays.toString(words));

        // You can build the sentence back with a loop
//        String newSentence = "";
//
//        for (int i = 0; i < words.length; i++) {
//            newSentence += words[i] + " ";
//        }
//
//        System.out.println(newSentence.trim());

        // Or Use the join method

        String newSentence = String.join(" ", words);

        System.out.println(newSentence);


    }





}
