package day27;

public class Dog {

    String name;
    Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {

        doSomething(Integer.valueOf(45));
        doSomething(45);
    }

    public static void doSomething(Integer num){

    }
}
