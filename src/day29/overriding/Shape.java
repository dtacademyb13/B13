package day29.overriding;

public class Shape {


    protected String color;
    protected boolean isFilled;


    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }


    public void getArea(){
        System.out.println("Calculating the shape's area");
    }

    public void getPerimeter(){
        System.out.println("Calculating the shape's perimeter");
    }


    public String toString() {
        return "color='" + color + '\'' +
                ", isFilled=" + isFilled;
    }
}
