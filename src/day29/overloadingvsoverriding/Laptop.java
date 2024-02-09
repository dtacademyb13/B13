package day29.overloadingvsoverriding;

public class Laptop extends Product{

  // Method overloading can happen within the same class and also in the subclass


    public void generateRandomID(){
        System.out.println("Generate random ID with 10 chars");
    }

    public void generateRandomID(int length, boolean isAlphaNumeric){

    }

//     void generateRandomID(int length){
//
//    }

     double generateRandomID(int i, int j){
        return 5.0;
     }


    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.generateRandomID();
        laptop.generateRandomID(5, true);
        laptop.generateRandomID(6);

        Product product = new Laptop();

    }
}
