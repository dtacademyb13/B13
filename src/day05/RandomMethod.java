package day05;

public class RandomMethod {


    public static void main(String[] args) {

       double randomNo =  Math.random();

        System.out.println(randomNo);


        // random number between 0-10 (not including 10)
                                          //0.45
        int randomNoBetween0And10 = (int)(Math.random() * 10);
        System.out.println(randomNoBetween0And10);

        System.out.println( (int)(Math.random() * 51) ); //0-50 (50 included)


       int num =  5 + (int)(Math.random() * 5); // 5-10 (10 not included)


        System.out.println( 25 + (int)(Math.random() * 15 ) ); // 25-39

        // generate random 2 digit number
        System.out.println( 10 + (int)(Math.random() * 90 ) ); // 10-99


        // generate random 4 digit number
        System.out.println( 1000 + (int)(Math.random() * 9000 ) ); // 1000-9999


       int num2 =  1000 + (int) (Math.random() * 9000) ;

        System.out.println(num2);



    }
}
