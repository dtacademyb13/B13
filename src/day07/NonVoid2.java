package day07;

public class NonVoid2 {


    public static void main(String[] args) {



//       double randomDouble = Math.random();
//
//        System.out.println( (char)(Math.random()*26 + 'A'));
////        System.out.println( (char)(MyMath.random()*26 + 'A'));
//
//        MyMath.random();
//
//
//        double pow = Math.pow(3, 4);




     String result = createFullName("John","Doe");  // calling the non void method does not produce any output
     System.out.println(result);


     System.out.println( createFullName("Bob", "Smith") );

    }



    //Create a method that accepts your first name and last name and returns the full name in "last name, first name" format

    public static String createFullName(String first, String last){
        String fullName = last + ", " + first;
        return fullName;
//        return last + ", " + first; // alternatively you can put the expression directly after return instead of storing in a variable
     //   System.out.println("vdsdvs"); //Unreachable statement
        // return statement is a must for a method that returns value
        // not adding a return statement results in compiler error

        // return statement ends the method and brings the execution back to the main (or any other calling) method
        // any statement after return is an unreachable statement that results in compiler error
    }
}
