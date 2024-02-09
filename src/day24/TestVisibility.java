package day24;

public class TestVisibility {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.name);
        dog.publicMethod();

        System.out.println(dog.age);
        dog.defaultMethod();

//        System.out.println(dog.breed); //'breed' has private access in 'day24.Dog'
//        dog.privateMethod(); //'privateMethod()' has private access in 'day24.Dog'

        Cat cat = new Cat();
    }
}
