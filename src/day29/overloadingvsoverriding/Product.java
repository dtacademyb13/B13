package day29.overloadingvsoverriding;

public class Product {

    public void generateRandomID(){
        System.out.println("Generate random ID with 5 chars");
    }

    public void generateRandomID(int length){

    }


    // For overloading, return type and visibility do not matter
    // Whereas for overriding these 2 need to follow specific rules
     private int generateRandomID(int length, double dsd){
         return 6;
    }
//

//    public void generateRandomID(int length){
//
//    }
}
