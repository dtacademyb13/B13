package day04;

import java.util.Scanner;

public class VariableAssignment {


    public static void main(String[] args) {


        int x = 6;

        int y = x;

        int z = 14 % 6 / 2 ;

        System.out.println(y);

        System.out.println(z);

        int w = 5;

        w = w + 1;

        System.out.println(w);

        String str = "hi";

        str  = str + " bye"; // hi bye

        System.out.println(str);

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // "day04.Hello"

        System.out.println(name);


        int i, j, k;

        i = j = k = 5;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


    }
}
