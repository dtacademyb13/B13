package day09;

import java.util.Scanner;

public class LogicalOps5 {


    public static void main(String[] args) {


      // For admission, you need to have GRE higher 750 and either a GPA of 3.9 or SAT score higher than 1100







        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your GRE score?:");

        double  gre = scanner.nextDouble();
        System.out.println("What is your GPA?:");

        double gpa = scanner.nextDouble();

        System.out.println("What is your SAT score?:");

        double  sat = scanner.nextDouble();



// For admission, you need to have GRE higher 750 and either a GPA of 3.9 or SAT score higher than 1100
        boolean canBeAdmitted =   gre >=750  &&  ( gpa >= 3.9 || sat >= 1100 );

        if(canBeAdmitted){
            System.out.println("Admitted");
        }else {
            System.out.println("Come back again");
        }





    }


}
