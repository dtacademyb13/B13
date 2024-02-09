package day24;

import java.util.Random;

public class DuotechStudent {

    String name;
    int id;
    int age;

    static String schoolName = "Duotech";  // static variables are properties that belong to all objects of the class

    public final static String PROGRAMMING_LANGUAGE = "Java";

    private static int no0fStudentObjects = 0;

    // how to decide if the class member (variable/method) is static or instance?
    // if the property/behavior is global (applies to all objects) -> it is static
    // if the property's value/behavior depends on each object  -> it is instance

    public DuotechStudent(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        no0fStudentObjects++;
    }

    public void updateStudentName(String name){ //
        this.name = name;
    }

    public void updateStudentIdToARandomId(){
        this.id = generateId();
    }

    public static int generateId(){
        return 1000 + new Random().nextInt(9000);
    }


    // another use case for static methods is a method that deals with a static variable
    public static int getNo0fStudentObjects(){
        return no0fStudentObjects;
    }







}
