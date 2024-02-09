package day09;

public class LogicalOps {


    public static void main(String[] args) {

        int age = 18;

        if ( ! (age >= 21) ) {
            System.out.println("You can't enter the facility.");
        }


        String answer = "yes";

        if (! answer.equals("yes")){
            System.out.println("Please enter positive answer");
        }



    }


}
