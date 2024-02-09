package day09;

public class Errors {


    public static void main(String[] args) {


//
//        if( 5 < 0);{  // logical error
//            System.out.println("5 is less than 0");
//        }




        int number = 55;

        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



        double num = 1.0 - 0.3 - 0.2;

        System.out.println(num);

        if (num == 0.5){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        double num2 = 0.5;
        // How to check the equality of 2 decimal values? (Don't use  ==)

        // Calculate the difference between 2 decimal values and if it is less than some tolerable amount (0.0001)

        if ( Math.abs(num - num2) < 0.0001 ){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }







    }



}
