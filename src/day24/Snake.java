package day24;

public class Snake {


   int noOfEggs;

   // members of the class: instance variables and methods
   public Snake(){

      this.noOfEggs = 8;
//      this(5);// must be the first statement

   }

   private Snake(int noOfEggs){

   }


   public void printNoOfEggs(){
//      this();  can't be used anywhere other than a constructor
      System.out.println(this.noOfEggs);
   }
}
