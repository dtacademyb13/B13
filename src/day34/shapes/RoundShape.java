package day34.shapes;

public abstract class RoundShape extends Shape{
    protected RoundShape(String color) {
        super(color);
    }


    public abstract double getCircumference();

}
