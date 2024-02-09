package day34.shapes;

public abstract class Shape {

    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
      this method returns the area of the shape
      area is calculated depending on the shape type
     */
    public abstract double getArea();
//
    public abstract double getPerimeter();
}
