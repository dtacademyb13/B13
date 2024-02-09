package day40.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {


    public static void main(String[] args) {


        LocalTime localTime = LocalTime.now(); // the format is 19:06:02.189722900
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(9, 30);
        LocalTime localTime2 = LocalTime.of(9, 30, 34, 342564);

        System.out.println(localTime1);

//        LocalTime timeFromString = LocalTime.parse("9:34"); //DateTimeParseException
        LocalTime timeFromString = LocalTime.parse("09:34:23"); // HH:mm:ss

        System.out.println(timeFromString);
    }
}
