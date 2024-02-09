package day09;

public class OneWayVSMultiwayIf2 {


    public static void main(String[] args) {


        int age = -9;

        // INDEPENDENT ONE WAY IF STATEMENTS
        // Any of these can be executed if the condition is true

//        if(age < 10){
//            System.out.println("You can't have a facebook account");
//        }
//
//        if(age < 16){
//            System.out.println("You can't drive");
//        }
//
//
//        if(age < 21){
//            System.out.println("You can't smoke");
//        }
//
//
//        if(age < 23){
//            System.out.println("You can't rent a car");
//        }
//
//        if(age < 35){
//            System.out.println("You can't become a US president");
//        }



        // DEPENDENT MULTI WAY IF STATEMENTS
        // Only one of these can be executed if the condition is true
        // Conditions are evaluated from top to bottom
        // As soon as the correct condition is meth, the rest of the conditions is skipped

        if ( age <= 0)  {
            System.out.println("Invalid age");
        }else if(age < 10){
            System.out.println("You can't have a facebook account");
        }else if(age < 16){
            System.out.println("You can't drive but have an fb acct");
        }else if(age < 21){
            System.out.println("You can't smoke but drive a car");
        } else if(age < 23){
            System.out.println("You can't rent a car but smoke");
        }else if(age < 35) {
            System.out.println("You can't become a US president but do all adult things");
        }else {
            System.out.println("You can be whoever and whatever you want to be.");
        }


    }
    


}
