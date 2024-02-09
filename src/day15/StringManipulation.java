package day15;

public class StringManipulation {


    public static void main(String[] args) {



        String str = "Leo loves burgers, fries and shakes.";
        //Find out the amount of vowels and consonants

        // 1. Access each char with a for loop
        // 2. Check if the char is a vowel
        // 3. Use a counter variable and increment it by one

        int countOfVowels = 0;
        int countOfConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){

                if("aeiouAEIOU".contains(ch+"")){
                    countOfVowels++;
                }else{
                    countOfConsonants++;
                }
            }

        }

        System.out.println("Vowels: " + countOfVowels);
        System.out.println("Consonants: " + countOfConsonants);








    }
}
