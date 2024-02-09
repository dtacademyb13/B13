package day30.task;

public class Main {


    public static void main(String[] args) {




        Course[] courses = new Course[3];

        courses[0] = new Course(
                "Intro to Java",
                "JI101",
                new Instructor("Dr. Bennet", "bennet@email.edu","CS"),
                20,
                3);


        courses[1] = new Course(
                "Intro to Python",
                "PY101",
                new Instructor("Dr. Bennet", "bennet@email.edu","CS"),
                10,
                6);

        courses[2] = new Course(
                "SDET Essentials",
                "SDET101",
                new Instructor("Dr. Benson", "benson@email.edu","CS"),
                15,
                2);


        for (Course course : courses) {

            System.out.println(course);

        }


    }
}
