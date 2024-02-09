package day26;

public class StringPoolQuestions {


    public static void main(String[] args) {



        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = new String("Java");
        // Question 1
        System.out.println("Is s1 == s3? " + (s1 == s3)); // true
        // Question 2
        System.out.println("Is s1 == s2? " + (s1 == s2)); // false
//        // Question 3
        System.out.println("Is s1.equals(s2)? " + s1.equals(s2)); // true
//        // Question 4
        s1 = s1.toUpperCase();
//        // Question 5
        System.out.println("After modification, is s1 == s3? " + (s1 == s3)); // false
        System.out.println("After modification, is s1.equals( s3)? " + (s1.equals(s3))); // false Java is not equal to JAVA
//        // Question 6
        System.out.println("Is s2 == s4? " + (s2 == s4)); //  false
//        // Question 7
        System.out.println("Is s2.equals(s4)? " + s2.equals(s4)); //true
    }
}
