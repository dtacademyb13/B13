package day06;

public class MethodsReUse {


     public static void main(String[] args) {
          System.out.println("Main method");
          System.out.println("First call");
          printHello10Times();
          System.out.println("Second call");
          printHello10Times();
          System.out.println("End of the main method");
     }

     public static void printHello10Times(){
          System.out.println("My method");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
          System.out.println("Hello");
     }

}
