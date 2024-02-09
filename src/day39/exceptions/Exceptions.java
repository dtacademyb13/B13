package day39.exceptions;

import day28.animals.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Exceptions {


    public static void main(String[] args) {

        System.out.println("Enter 2 numbers and I will show you the division result:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        try{
             String str = null;
             System.out.println(str.toUpperCase());
             int[] arr =  new int[3];
             System.out.println(arr[0]);
             result = a / b;

//        }catch (NullPointerException e){ // The type of the exception in the catch block should match the type that is thrown out of the try block
                                           // If it doesn't match the exception will be thrown
        }catch (ArithmeticException e){
//            System.out.println("No division by zero allowed. Ending the program...");
//            System.exit(2);
            System.out.println("No division by zero allowed. The result of division is 0.");
//            System.exit(2);
        }


        System.out.println("Result: " + result);





    }
}
