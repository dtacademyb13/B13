package day07;

public class NonVoidMethods {


    public static void main(String[] args) {

//        printSomeRandomWholeNumber();

//        System.out.println(  getSomeRandomWholeNumber() );

        System.out.println("This a program that displays random number between 0-100");

//        int rand = getSomeRandomWholeNumber();
//        System.out.println("Here's your random number: " + rand);

//
        System.out.println("Here's your random number: " + getSomeRandomWholeNumber());


     // int a =  printSomeRandomWholeNumber();  // void methods do not return any value so we can't assign the result of method call to any variable


      char ch =  getSomeRandomUppercaseLetter();





    }

    public static void printSomeRandomWholeNumber(){
       int randomNo =  (int)(Math.random()*100);
        System.out.println(randomNo);
    }

    public static int getSomeRandomWholeNumber(){

        int randomNo =  (int)(Math.random()*100);

        return randomNo;
    }


    public static char getSomeRandomUppercaseLetter(){

        char randomChar =  (char)(Math.random() * 26 + 'A');

        return randomChar;
    }





}
