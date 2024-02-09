package day21;

import java.util.Random;

public class OverloadedRandomString {

    public static void main(String[] args) {


        // TEST your methods here

        System.out.println( randomString()); //  dshvf (example, the actual chars could be different)

         System.out.println( randomString(7)); //cbsassw
        System.out.println( randomString(5, true)); // RVDHC
        System.out.println( randomString(3, false)); //hsd

    }

    // Create 3 overloaded methods here
    public static String randomString(){
      return randomString(5);
    }

    public static String randomString(int length){
        Random random = new Random();
        String randomStr = "";
        for (int i = 0; i < length; i++){
            char randomChar = (char) (random.nextInt(26) + 'a');
            randomStr += randomChar;
        }
        return randomStr;
    }

    public static String randomString(int length, boolean isUppercase){
        return  isUppercase ? randomString(length).toUpperCase() :  randomString(length) ;
    }
}
