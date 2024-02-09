package day22;

public class Flower {


    String name;
    String color;
    boolean perennial;

    public Flower(String name, String color, boolean perennial) {
        this.name = name;
        this.color = color;
        this.perennial = perennial;
    }

    public Flower() {
    }

    public Flower(String name) {
        this.name = name;
    }
}
