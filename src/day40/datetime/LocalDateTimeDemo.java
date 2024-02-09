package day40.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LocalDateTimeDemo {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now(); //2024-01-30T19:15:49.064345500

        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2012, 01, 01, 14, 30);

        String timeStamp = "2024-01-30T19:15:49";
        LocalDateTime timeStampAsDateTiemObject = LocalDateTime.parse(timeStamp);

        System.out.println(timeStampAsDateTiemObject);

        LocalDate birthday = LocalDate.of(1985, 3, 14);

        System.out.println(birthday.getDayOfWeek());


        List<LocalDateTime> timestamps = new ArrayList<>();

        timestamps.add(LocalDateTime.of(2023,1,1,23,34));
        timestamps.add(LocalDateTime.of(2023,1,1,11,23));
        timestamps.add(LocalDateTime.of(2022,4,1,23,34));
        timestamps.add(LocalDateTime.of(2024,1,30,23,34));

        System.out.println(timestamps);

        Collections.sort(timestamps);

        System.out.println(timestamps);



    }
}
