package day28;

import day29.Appliance;

public class TestVisibility {


    public static void main(String[] args) {

        Appliance appliance = new Appliance();

        System.out.println(appliance.publicVar);
//        System.out.println(appliance.defaultVar);
    }
}
