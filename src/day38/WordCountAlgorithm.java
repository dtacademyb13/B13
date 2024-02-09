package day38;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCountAlgorithm {

    // Frequency Algo

   // Write a program using Map interface that counts the occurrences of words
    // in a text and displays the words and their occurrences in alphabetical order of the words.


    // {it=2,is=4,with=1, a=7}

    public static void main(String[] args) {

        String text = "It is with a heavy heart that I take up my pen to write these the last words in which I shall ever record the singular gifts by which my friend Mr. Sherlock Holmes was distinguished. In an incoherent and, as I deeply feel, an entirely inadequate fashion, I have endeavored to give some account of my strange experiences in his company from the chance which first brought us together at the period of the “Study in Scarlet,” up to the time of his interference in the matter of the “Naval Treaty”—an interference which had the unquestionable effect of preventing a serious international complication. It was my intention to have stopped there, and to have said nothing of that event which has created a void in my life which the lapse of two years has done little to fill. My hand has been forced, however, by the recent letters in which Colonel James Moriarty defends the memory of his brother, and I have no choice but to lay the facts before the public exactly as they occurred. I alone know the absolute truth of the matter, and I am satisfied that the time has come when no good purpose is to be served by its suppression. As far as I know, there have been only three accounts in the public press: that in the Journal de Genève on May 6th, 1891, the Reuter's despatch in the English papers on May 7th, and finally the recent letters to which I have alluded. Of these the first and second were extremely condensed, while the last is, as I shall now show, an absolute perversion of the facts. It lies with me to tell for the first time what really took place between Professor Moriarty and Mr. Sherlock Holmes.";

        // Create a list of words

        String[] words = text.toLowerCase().split("[ ,.;:!?(){}]+");

        System.out.println(Arrays.toString(words));

        Map<String, Integer> wordMap =  new HashMap<>();

        // Iterate through the list and add each word to a map


//        for (String word : words) {
//            if(!wordMap.containsKey(word)){  // check if the word does not exist as a key in this map
//                wordMap.put(word, 1); // add this word as a key and 1 as its value since it is the first occurence
//            }else{
////                Integer value = wordMap.get(word); // get the current word's occurrence
////                value++;  // increment by one
////                wordMap.put(word,value); // update the current word's old value with the incremented value
//                wordMap.put(word, wordMap.get(word)+1);
//            }
//        }

        // Shorter way with getOrDefault() method
        for (String word : words) {
           wordMap.put(word, wordMap.getOrDefault(word, 0)+1) ;
        }


        System.out.println(wordMap);

    }
}
