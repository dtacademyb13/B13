package day26;

public class StringImmutability2 {

    public static void main(String[] args) {

         String str = "Java"; // created in String pool
         String str2 = "Java";

        System.out.println( str == str2);
        System.out.println( str.equals(str2));

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.toString() == str); // false

        System.out.println(sb.toString().equals(str)); // true

    }
}
