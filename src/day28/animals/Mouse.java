package day28.animals;

public class Mouse {

    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        mouse.equals(new Mouse());
        mouse.toString();
        mouse.hashCode();
    }
}
