package day22;

public class StudentTester {

    public static void main(String[] args) {


        Student student1 = new Student("Bob", "12", 34,3.4);
        student1.printInfo();

        Student student2 = new Student();
        student2.printInfo();

        Student student3 = new Student();
        student3.printInfo();

        Student student4 = new Student("Samantha");
        student4.printInfo();




    }
}
