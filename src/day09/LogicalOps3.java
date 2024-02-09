package day09;

import java.util.Scanner;

public class LogicalOps3 {


    public static void main(String[] args) {


      // For admission, you need to have either a GPA of 3.9 or SAT score higher than 1100







        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your GPA?:");

        double gpa = scanner.nextDouble();

        System.out.println("What is your SAT score?:");

        double  sat = scanner.nextDouble();


        boolean canBeAdmitted =  gpa >= 3.9 || sat >= 1100;

        if(canBeAdmitted){
            System.out.println("Admitted");
        }else {
            System.out.println("Come back again");
        }





    }


}
