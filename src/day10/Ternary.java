package day10;

public class Ternary {


    public static void main(String[] args) {


        // Unary -> Requires only one value
        //
        int i = 9;
        i++;

        // Binary operator -> requires 2 values

        System.out.println(i * i);

        // Ternary operator -> requires 3 values

        //   condition ? true : false


        int num = 45;

//        if(num % 2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }

//     String result =   num % 2 == 0 ? "Even" : "Odd" ; // can be assigned to a variable

        System.out.println((num % 2 == 0) ? "Even" : "Odd");

    }
}
