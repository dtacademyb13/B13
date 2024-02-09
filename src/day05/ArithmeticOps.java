package day05;

public class ArithmeticOps {

    public static void main(String[] args) {



        char ch = 'F';

//        System.out.println( (int) 'F');

        int someCharIntValue = ch + 10;

        ch = (char)(ch + 10);

        System.out.println(ch);  // 'P'

        char ch2 ='x';
        System.out.println(++ch2);


        // implicit upcast of a char to int

        int num = 'a';
        System.out.println(num);

        // explicit downcast is required for reverse direction
        int num2 = 66;
        char ch4 = 65;
        char ch5 = (char) num2;
        System.out.println(ch4);
        System.out.println(ch5);

    }
}
