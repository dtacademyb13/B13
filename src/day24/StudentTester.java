package day24;

public class StudentTester {

    public static void main(String[] args) {

        DuotechStudent duotechStudent1 = new DuotechStudent("Bob", 1, 23 );
        DuotechStudent duotechStudent2 = new DuotechStudent("Alice", 2, 33);
        DuotechStudent duotechStudent3 = new DuotechStudent("Jane", 3, 34);



        // Access the static variable -> ClassName.VaraiableName
        System.out.println(DuotechStudent.schoolName);
        System.out.println(duotechStudent1.schoolName); // Java allows you to access static variables/method through each object but it is not recommended

        //Update the static variable
        DuotechStudent.schoolName = "TechDuo";
        System.out.println(DuotechStudent.schoolName);

        // Try to update the static constant
//        DuotechStudent.PROGRAMMING_LANGUAGE = "Python";
        System.out.println(DuotechStudent.PROGRAMMING_LANGUAGE);

        // Example of a constant from Java library
        System.out.println(Math.PI);


        duotechStudent1.updateStudentName("Richard");
        System.out.println(duotechStudent1.name);

        // static methods are typically helper/utility methods that do NOT depend on or tied to any object
        DuotechStudent.generateId();

        System.out.println(DuotechStudent.getNo0fStudentObjects());

        DuotechStudent duotechStudent4 = new DuotechStudent("Jake", 4, 23);

        System.out.println(DuotechStudent.getNo0fStudentObjects());

    }
}
