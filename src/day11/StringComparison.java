package day11;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {




           String str1 = new String("java");
           String str2 = new String("java");

//           if(str1 == str2){ // don't use == with string or any objects
           if(str1.equals(str2)){ // don't use == with string or any objects
               System.out.println("equal");
           }else{
               System.out.println("not equal");
           }

//        System.out.println("Enter yes/no");
//         String input =  new Scanner(System.in).next();
//
//        if(input.equalsIgnoreCase("yes")){
//            System.out.println("You entered yes");
//        }else{
//            System.out.println("you entered no");
//
//        }


        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo("a"));

        // To check if a string starts with/ends with/contains some other string

        String text = "Leo loves burgers";

        System.out.println(text.startsWith("Leo l"));
        System.out.println(text.endsWith("s"));
        System.out.println(text.endsWith("gers"));
        System.out.println(text.endsWith("Burgers"));
        System.out.println(text.contains("love"));
        System.out.println(text.contains("s b"));
        System.out.println(text.contains("x"));
        System.out.println(text.contains("v"));
        System.out.println(text.contains("o loves b"));




    }
}
