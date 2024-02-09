package day29.overriding;

public class TestShapes {

    public static void main(String[] args) {

        Circle circle = new Circle("white", true, 3.6);
        circle.getArea();
        circle.getPerimeter();

        System.out.println(circle.toString());



    }
}
