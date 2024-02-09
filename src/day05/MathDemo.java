package day05;

public class MathDemo {

    public static void main(String[] args) {

        double piValue = Math.PI;
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double radius = 7.56;
        System.out.println("The area of a circle is: " + radius * radius * Math.PI);


        //absolute value

        System.out.println(Math.abs(-7));
        System.out.println(Math.abs(34));

        // Find the difference between 2 values
        int a = 23;
        int b = 17;

        int res = Math.abs(a-b);
        System.out.println("The difference: " + Math.abs(a-b));

        // Round up or down

        double result = Math.ceil(6.01);
        System.out.println(result);

        double result2 = Math.floor(6.99);
        System.out.println(result2);


        double someNum = 3.14;
        long result3 = Math.round(someNum);
        System.out.println(result3);

        System.out.println(Math.round(5.78));
        System.out.println(Math.round(6.49));
        System.out.println(Math.round(7.5));

        int result5 = Math.max(23,12);
        System.out.println(result5);

        double x = 3.4;
        double y = 3.44;

        double result6 = Math.min(x, y);
        System.out.println(result6);

        // Find the max/min of 3 values

        int first = Math.max(1, 3);
        int finalResult = Math.max(first, 5);


        System.out.println(Math.max( Math.max(1, 3), 5));

        // Raises the number to the Nth power

        double result7 = Math.pow(2, 10);
        System.out.println(result7);

        // square root of a number

        double result8 = Math.sqrt(81);
        System.out.println(result8);

        System.out.println((long)Math.sqrt(672354572257L));
        System.out.println( Math.floor( Math.sqrt(672354572257L) ) );



        Math.sqrt(100);// nothing is displayed since we are not using the value of the operation


       //int m = Math.sqrt(10);

        System.out.println(0.1 + 0.2);

    }
}
