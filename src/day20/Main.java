package day20;

public class Main {

    public static void main(String[] args) {


        System.out.println(Calculator.add(2, 4));
        System.out.println(Calculator.add(2.4, 4.5));

        System.out.println(Calculator.add(2, 4, 6));

        System.out.println(Calculator.add(3L, 6F));
        System.out.println(Calculator.add(3F, 6L));
    }
}
