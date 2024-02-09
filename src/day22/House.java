package day22;

public class House {

    String color = "white" ;
    double area  = 4500;

    int noOfBedrooms = 5 ;
    int noOfBaths = 5 ;

    public House(String color, double area) {
        this.color = color;
        this.area = area;

    }

    public House(){

    }

    public static void main(String[] args) {
        House house = new House();
        house.printAll();
        House house2 = new House();
        house2.printAll();
    }

    public void printColor(){
        System.out.println("Color: " + color);
    }



    public void printAll(){
        System.out.println("House{" +
                "color='" + color +
                ", area=" + area +
                ", noOfBedrooms=" + noOfBedrooms +
                ", noOfBaths=" + noOfBaths +
                '}');
    }




}
