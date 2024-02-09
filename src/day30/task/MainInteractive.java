package day30.task;

import java.util.Scanner;

public class MainInteractive {


    public static void main(String[] args) {


        System.out.println("How many courses do you want to add? :");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        Course[] courses = new Course[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Course details:");
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("Code: ");
            String code = scanner.nextLine();
            System.out.println("Max Enrollment: ");
            Integer max = Integer.valueOf(scanner.nextLine());
            System.out.println("Current Enrollment: ");
            Integer current = Integer.valueOf(scanner.nextLine());


            System.out.println("Enter Instructor details:");
            System.out.println("Name: ");
            String insName = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Dept: ");
            String dept = scanner.nextLine();


            courses[i] = new Course(
                    name,
                    code,
                    new Instructor(insName, email,dept),
                    max,
                    current);
        }


        System.out.println("Here are the courses that you've created: ");

        for (Course course : courses) {

            System.out.println(course);

        }


    }
}
