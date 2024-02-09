package day03;

public class Literals {

    public static void main(String[] args) {

        //There are 6 types of literals in Java;

        // integral -> whole numbers

       int num =  3246;  // any whole number in Java is by default considered int
        System.out.println(634786743237842376L); //long literal

       double f = 3.14; // any decimal value by default is considered a double by java compiler

        float fl = 3.14F; // float literal

        System.out.println("hello");

        String str = "hello"; // anything with double quotes is a String literal

        System.out.println('a');

        char ch = 'x'; //character literal

        System.out.println(false);
        boolean c = true;

        //You can use underscores in numeric literals


        int phone = 202_123_4321;
        long card = 2315_3621_5352_6712L;
        System.out.println(phone);

        double distance = 2_315_641.483_627_432;

        // _ cannot come in the beginning or at the end of the literal or before or after dot in decimals


    }
}
