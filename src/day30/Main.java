package day30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Student table = new Student();
//        System.out.println(table.toString());
//        System.out.println(table.hashCode());
//        System.out.println(table.equals(new Student()));

        Student[] students = new Student[] {
                new Student("John Doe", 234, "Biology"),
                new Student("Jane Smith", 111, "Chemistry"),
                new Student("Alice Baker", 222, "History"),
                new Student("Bob Dole", 666, "Computer Science"),
        };


        for (Student student: students){
//            System.out.println(student.toString());
            System.out.println(student);
        }


        System.out.println(new Cup()); // printing an object or its reference calls its toString() implicitly
        Cup cup = new Cup();
        System.out.println(cup);

        OnlineStudent onlineStudent = new OnlineStudent("Joe Schmoe", 777,"Psychology", "NY");

        System.out.println(onlineStudent);

        Student student1 =   new Student("John Doe", 234, "Biology");
        Student student2 = new Student("Jane Smith", 234, "Chemistry");

        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode()); // returns the unique hashcode, must be overridden along with equals method
        System.out.println(student2.hashCode());


        System.out.println(student1.getClass()); //returns the actual object's class


        Student student3 = new Student("John Doe", 234, "Biology");
        Student student4 = new OnlineStudent("Joe Schmoe", 777,"Psychology", "NY");

        System.out.println(student3.getClass());
        System.out.println(student4.getClass());


        int[] arr = {1,2,3};
        System.out.println(arr.toString()); // prints hashcode since toString() is not overridden in arrays

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        String str = "Hello";
        System.out.println(str); // prints the content of the String object since toString() is overridden in String class
        String str2 = "Hello";

        System.out.println(str.equals(str2)); //true since equals() is overridden in String class to provide content equality

        StringBuilder sb = new StringBuilder("Hi");
        StringBuilder sb2 = new StringBuilder("Hi");
        System.out.println(sb.equals(sb2)); //false since equals() is not overridden in StringBuilder class to provide content equality

    }
}
