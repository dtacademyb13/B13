package day14;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {


        System.out.println("Enter a number");
//        System.out.println(reverse(new Scanner(System.in).nextInt()));
        System.out.println(reverseAsString(new Scanner(System.in).nextInt()));
    }

    public static int reverse(int num){

        int reversed = 0;
        while(num != 0){
            int number = (num % 10);
            reversed =  reversed * 10 + number;
            num = num / 10;

        }
       return reversed;





    }

    public static String reverseAsString(int num){

        String reversed = "";
        String number = String.valueOf(num);
        for (int i = number.length()-1 ; i >=0 ; i--) {
             reversed+=number.charAt(i);
        }
        return reversed;





    }
}
