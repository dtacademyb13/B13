package day34.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {



        Shape shape  = new Circle("black", 10);

//        Shape shape2 = new Shape("cdds"); //'Shape' is abstract; cannot be instantiated

        // How do you prevent instantiation (creating an object out) of the class?

//
        // 1. Making the class abstract
        // 2. Making the no-arg constructor private   Math math = new Math();

        RoundShape shape2 =  new Oval("green");
        shape2.getCircumference();

        List<Shape> shapes = new ArrayList<>(); // Abstract class can still be used as a reference type for a collection, as a method parameter or return type



        setShapeColor(new Circle("dsds", 23));


        Shape myShape = new Rectangle("green", 34,12);
        myShape.getPerimeter();


        // NUmber class is an example of an abstract super class

        Number number = 5;
        System.out.println(number.doubleValue());

        List<Shape> shapesList = Arrays.asList(
                new Circle("ds", 12),
                new Rectangle("ds",12,2),
                new Oval("ds")
        );

        for (Shape shape1 : shapesList) {
//            System.out.println(shape1.getArea());
            System.out.println(shape1.getClass()); // returns the class of the actual object assigned to the reference
        }





    }


    public static Shape getShape(){
        return new Circle("ds",12);
    }

    public static void setShapeColor(Shape shape){
        shape.setColor("dsdds");
    }
}
