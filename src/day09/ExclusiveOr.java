package day09;

public class ExclusiveOr {


    public static void main(String[] args) {

// Exclusive OR is just like normal OR except for  true ^ true -> false
        System.out.println( true ^ true);
        System.out.println( true || true);


        int num = 15;

        if( num % 3 == 0  ^ num % 5 ==0){
            System.out.println("Num is divisible by either 3 or 5 but not both");
        }


    }
}
