package day04;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {


        System.out.print("Enter a 4 digit number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int original = number;

        int fourth = number % 10;

        number = number / 10;

        int third = number % 10;

        number /= 10; //number = number / 10;

        int second = number % 10;

        number /= 10; //1

        int first = number % 10;


        System.out.printf("The reverse of %d is %d%d%d%d ", original, fourth,third,second,first );




    }
}
