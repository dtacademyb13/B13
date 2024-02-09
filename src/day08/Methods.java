package day08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Methods {


    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = scanner.nextDouble();

        double area = getArea(radius);

        displayArea(area);

//        displayArea( getArea(radius) );




    }
    public static double getArea(double radius){
        return radius * radius * Math.PI;
    }

    public static void displayArea(double area){
        System.out.println("Area is: " + area);
    }
}
