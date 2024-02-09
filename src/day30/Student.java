package day30;

import java.util.Objects;

//public class Student extends Object{
public class Student {


   // POJO -> Plain Old Java Object
   // It is a typical java class that contains
   // instance variables, constructors, getter and setters and standard
   // overridden methods such as toString(), equals() and hashcode()


    private String name;
    private int id;

    private String major;

    public Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

//    @Override
//    public String toString(){
//        return "name: " + name + ", major: " + major + ", id: " + id;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", major='" + major + '\'' +
                '}';
    }


//    public boolean equals(Object o){
//        return this.id == ((Student)o).id;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
