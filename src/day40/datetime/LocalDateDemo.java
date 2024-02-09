package day40.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

    public static void main(String[] args) {


        LocalDate now = LocalDate.now(); //2024-01-30

        System.out.println(now);

        LocalDate birthDay = LocalDate.of(1985, 3, 14);
        LocalDate birthDay2 = LocalDate.of(1985, Month.MARCH, 14);

        System.out.println(birthDay);

        Person person1 = new Person("John Doe", LocalDate.of(1988,6,11));

        System.out.println(person1);

        LocalDate date = LocalDate.parse("2024-01-01"); // the format  has to be YYYY-MM-DD
        System.out.println(date);

        // Adding/subtracting

        LocalDate now1 = LocalDate.now();
        LocalDate futureDate = now1.plusDays(500);// All Date and Time classes are immutable
        System.out.println(now1);
        System.out.println(futureDate);

        System.out.println(now1.minusDays(10000));
        System.out.println(now1.minusWeeks(5000));

        // Comparison methods
        LocalDate specificDate = LocalDate.of(1990, 01, 01);
        LocalDate specificDate2 = LocalDate.of(2000, 01, 01);
        if(birthDay.isBefore(specificDate)){

            System.out.println("Millenial");
        }
        if(birthDay.isAfter(specificDate2)){
            System.out.println("GEN Z");
        }

        // Range

        if(birthDay.isBefore(specificDate) && birthDay.isAfter(specificDate2)){
            System.out.println("You are a millennial");
        }

        System.out.println(LocalDate.now().isLeapYear());


    }
}
