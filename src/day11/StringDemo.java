package day11;

import java.util.Scanner;

public class StringDemo {


    public static void main(String[] args) {


        Scanner scanner =  new Scanner(System.in);

        String str = "hello";
        String str2 = new String(); //empty string
        String str3 = new String("hi");


        String word = "dog \nbarks";

        int i = word.length();

        System.out.println(i);

        System.out.println(word.length());
        System.out.println("cats".length()); // you can call  a method on a string literal
        System.out.println("".length()); // empty string has a 0 length

        String anotherWord = "duotech academy";

        char c = anotherWord.charAt(0);

        System.out.println(c);
        System.out.println(anotherWord.charAt(6));
        int lastIndex = anotherWord.length()-1;
        System.out.println(anotherWord.charAt(lastIndex));
        System.out.println(anotherWord.charAt(anotherWord.length()-1));


        String st = "academy";

//        System.out.println(st.charAt(-1)); //StringIndexOutOfBoundsException
//        System.out.println(st.charAt(7));
//        System.out.println(st.charAt(st.length()));
        //StringIndexOutOfBoundsException


//        StringDemo.myMethod();

        System.out.println("Enter a string and I will display its second to last char:");

        String input = new Scanner(System.in).next();

        System.out.println("The char is: " + getSecondToLastChar(input));



    }


    public static char getSecondToLastChar(String str){
        return  str.charAt(str.length()-2);
    }
}
