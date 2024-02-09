package day27;

import java.util.Arrays;
import java.util.Scanner;

public class RegexWithStringMethods2 {

    public static void main(String[] args) {



        String str = "Leo loves burgers, and fries 4_ever.()";

        System.out.println(str.replace(" ", "-"));

        System.out.println(str.replaceAll("[ ,.()]", ""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", "")); // not alphanumeric
        System.out.println(str.replaceFirst(" ", "-")); // not alphanumeric



    }
}
