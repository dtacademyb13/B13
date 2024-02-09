package day35.interfaces;

public class Ball implements Throwable, Movable{
    @Override
    public void throwItem() {
        System.out.println("Throw the ball");
    }
}
