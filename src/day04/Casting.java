package day04;

public class Casting {


    public static void main(String[] args) {


        double number = 5;
//        double number = (double) 5;
        System.out.println(number);

        // implicit upcasting / widening

        int anotherNum = (int) 3.14;
        System.out.println(anotherNum);

        double price = 25.17;
        int newPrice = (int)price;
        System.out.println("The price is $" + newPrice);
        System.out.println(price);


        int num = 1;

        byte b = (byte)num; // variable assignment requires casting

//        byte b2 = 127; // value assignment works fine as long as the value is within the range

        int z = 200;

        byte b4 = (byte)z;

        System.out.println(b4);


        // Integer Overflow / Underflow

//        byte byteVar = -128;
//        byteVar--;
//        System.out.println(byteVar);

    }
}
