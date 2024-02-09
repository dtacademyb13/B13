package day31.polymorphism;

public class Student {

    String name;
    String state;


    public Student(String name, String state) {
        this.name = name;
        this.state = state;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }


    public static void main(String[] args) {

       Student student = new Student("dsds", "VA");
        String str = " Hello this is: " + new Student("dsds", "VA").toString();
        String str2 = " Hello this is: " + student;
        System.out.println(str2);

    }
}
