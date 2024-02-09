package day05;

public class GenerateRandomChar {


    public static void main(String[] args) {

        // Generate a random uppercase char

        char num = (char)(65 + (int) (Math.random() * 26 ));
        char num2 = (char) (Math.random() * 26 + 'A' );
        char num3 = (char) (Math.random() * 26 + 'A' );

        System.out.print(num);
        System.out.print(num2);
        System.out.println(num3);

    }
}
