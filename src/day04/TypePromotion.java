package day04;

public class TypePromotion {


    public static void main(String[] args) {

       // Java automatically promotes each byte, short, or char operand to int when evaluating an expression.

        byte b1 = 12;
        byte b2 = 3;

         byte b3 = (byte)(b1 + b2);


      short sh = (short)(b1 + b2);


    //     If one operand is a long, float or double
        //  the whole expression is promoted to long, float or double respectively.


        System.out.println( 10.0 / 4);

//         long l = 45L + 34 + (byte)45 + 3.5f ; // -> float

    }
}
