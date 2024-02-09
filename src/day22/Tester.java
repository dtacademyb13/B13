package day22;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        House house1 = new House();
        house1.area = 5700;
        house1.color = "Gray";
        house1.noOfBaths = 4;
        house1.noOfBedrooms = 5;


        System.out.println(house1.area);
        house1.printColor();
        house1.printAll();

        House house2 = new House();
        house2.area = 2700;
        house2.color = "White";
        house2.noOfBaths = 3;
        house2.noOfBedrooms = 2;


        house2.printColor();
        house2.printAll();





    }
}
