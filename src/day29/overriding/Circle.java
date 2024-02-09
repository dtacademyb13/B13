package day29.overriding;

public class Circle extends Shape{


    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public void getArea(){
        System.out.println("The circle's area is: " + Math.PI* radius * radius);
    }

    public void getPerimeter(){
        System.out.println("The perimeter of a circle: " + 2 * Math.PI * radius);
    }

    public String toString() {
        return super.toString() +
                ", radius= " + radius;

    }
}
