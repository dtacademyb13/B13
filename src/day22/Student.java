package day22;

public class Student {

    String name;
    String id;
    int age;
    double gpa;

    //All Args constructor
    public Student (String name, String id, int age, double gpa){
        this.name = name; // this.name -> name variable that belongs to this class
        // this keyword refers to this class's object and used to access instance variables and instance methods
        // Typically it is needed when there is a naming conflict between a local variable and an instance variable
        this.id =id;
        this.age = age;
        this.gpa = gpa;
    }

    //No args constructor
    public Student(){
        name = "Alice";
        id = "1";
        age = 23;
        gpa = 4.0;
    }

    public Student (String name1){
        name = name1;
    }




    public void printInfo() {
        String name = "dvbsjh";

        System.out.println(
                "name='" + this.name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gpa=" + gpa);
    }

    public void printName() {
        System.out.println(
                "name='" + name + "'" );
    }
}
