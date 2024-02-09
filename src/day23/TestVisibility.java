package day23;


//import day24.Cat; //day24.Cat' is not public in 'day24'. Cannot be accessed from outside package
import day24.Dog;

public class TestVisibility {

    public static void main(String[] args) {


        Dog dog = new Dog();
//        Dog dog2 = new Dog(5);
        System.out.println(dog.name);
        dog.publicMethod();

//        System.out.println(dog.age); //'age' is not public in 'day24.Dog'. Cannot be accessed from outside package
//        dog.defaultMethod(); //'defaultMethod()' is not public in 'day24.Dog'. Cannot be accessed from outside package

//        System.out.println(dog.breed); //'breed' has private access in 'day24.Dog'
//        dog.privateMethod(); //'privateMethod()' has private access in 'day24.Dog'


//        Cat cat = new Cat();
    }
}
