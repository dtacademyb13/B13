package day18;

public class Palindrome {

    public static void main(String[] args) {

        //Find if a string is a palindrome
        String str = "civac";

        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){

        for (int i = 0, j = str.length()-1; i < j ; i++, j--) {

            char start = str.charAt(i);
            char end = str.charAt(j);

            if(start != end){
                return false;  //ends the method right away
            }


        }

        return true;

    }

}
