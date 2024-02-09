package day35.interfaces;

public interface Movable {

    void throwItem();

    default void throwAnotherOne(){
        System.out.println("Some deafult implementation");
    }
}
