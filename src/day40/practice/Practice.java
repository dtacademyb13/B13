package day40.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.*;

public class Practice {


    public static void main(String[] args) throws IOException {


        List<String> content = Files.readAllLines(Path.of("src/day40/practice/data.csv"));

        List<List<String>> students = new ArrayList<>();

        for (String each : content) {
            students.add(Arrays.asList(each.split(",")));
        }




        // Iterate through the list of list and create a list of student objects


         List<Student> studentObjects = new ArrayList<>();
        for (List<String> student : students) {


            studentObjects.add(new Student(Integer.parseInt(student.get(0)),
                        student.get(1),
                        student.get(2),
                        student.get(3),
                        LocalDateTime.parse(student.get(4))
                       ));
        }


//        studentObjects.forEach(System.out::println);

        // oldest and youngest

        studentObjects.sort(Comparator.comparing(Student::getDob));

        studentObjects.forEach(System.out::println);

        List<String> oldestAndYoungest =  new ArrayList<>(Arrays.asList(studentObjects.get(0).toString(), studentObjects.get(studentObjects.size()-1).toString()));
        System.out.println("The oldest: " + studentObjects.get(0));
        System.out.println("The youngest: " + studentObjects.get(studentObjects.size()-1));

        // Write these 2 students to a file

        Files.write(Path.of("src/day40/practice/maxMin.csv"), oldestAndYoungest);











    }
}
