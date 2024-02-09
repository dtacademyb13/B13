package day04;

public class IncrementDecrement {


    public static void main(String[] args) {

        int i = 5;

        i++; //i = i + 1;
//        i--;
        System.out.println(i);

        int x = 9;
        --x;
        ++x;
        System.out.println(x);


        int z = 3;
//        System.out.println(++z); // pre -> increment first and use(print)
        System.out.println(z++); // use (print) first and then increment
        System.out.println("Z's value after post increment " + z);


//        int a = 5;
//        int b = ++a;
//
//        System.out.println(b);
//        System.out.println(a);


        int a = 5;
        int b = a++;

        System.out.println(b);
        System.out.println(a);


        int c = 6;
        int d = 9;

        int e = c++ + ++d;

        System.out.println(e); // 16
        System.out.println(c); //7


        int m = 7;

        int result = m++ +  m++  +  ++m  +  m  +  m++;


        System.out.println(result); //45





    }
}
