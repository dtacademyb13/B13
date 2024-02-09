package day34.shapes;

public class Circle extends Shape{

    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        System.out.print("Circle: ");
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

}
