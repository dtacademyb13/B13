package day06;

public class MethodsReUse2 {


     public static void main(String[] args) {

          /*
+----------------+
|                |
|   ><(((º>      |
|                |
|        ><(((º> |
|                |
|   ><(((º>      |
|                |
|        ><(((º> |
|                |
+----------------+


           */




          printEdges();
          printEmptyAndFish1();
          printEmptyAndFish2();
          printEmptyAndFish1();
          printEmptyAndFish2();
          printEdges();




     }

     public  static void printEdges(){
          System.out.println("+----------------+");
     }

     public  static void printEmptyLine(){
          System.out.println("|                |");
     }

     public  static void printFish1(){
          System.out.println("|   ><(((º>     |");
     }

     public  static void printFish2(){
          System.out.println("|        ><(((º>|");
     }

     public static void printEmptyAndFish1(){
          printEmptyLine();
          printFish1();
     }

     public static void printEmptyAndFish2(){
          printEmptyLine();
          printFish2();
     }


}
