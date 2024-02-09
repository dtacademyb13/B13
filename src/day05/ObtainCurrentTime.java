package day05;

public class ObtainCurrentTime {

    public static void main(String[] args) {


        long millisecondsSince1970 =  System.currentTimeMillis(); //gives you the total amount of
        // milliseconds starting from January 1st, 1970 (Unix Time), it is derived from the  system clock

        System.out.println("The total amount of milliseconds elapsed since January 1st, 1970 (Unix Time) " + millisecondsSince1970);

        // You can use it to create  a unique string

        String nameOfFile = "file" + System.currentTimeMillis() + ".txt";

        System.out.println(nameOfFile);

    }
}
