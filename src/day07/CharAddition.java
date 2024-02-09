package day07;

public class CharAddition {


    public static void main(String[] args) {



        char let = (char)(Math.random() * 26 + 'A');
        char let1 = (char)(Math.random() * 26 + 'A');
        char let2 = (char)(Math.random() * 26 + 'A');


        int num = (int)(Math.random() * 10);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);


        System.out.println("" + let + let1 + let2);
        System.out.println( String.valueOf(let) + let1 + let2);

        //String s = String.valueOf(let);


        String num4 = "" + let + let1 + let2 + "-" + num + num1 + num2 + num3;

        System.out.println(num4);


        System.out.println( myMethod() );

        String str = null;

        //int  i = null;


    }


    public static String myMethod(){


        return "hello";
//        return "hello";

    }
}
