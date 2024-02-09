package day34.shapes;

public class Oval extends RoundShape{
    protected Oval(String color) {
        super(color);
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getArea() {
        System.out.print("Oval: ");
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
