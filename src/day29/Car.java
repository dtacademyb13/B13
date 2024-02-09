package day29;

public class Car extends Vehicle{

    private String VIN;
    private int noOfDoors;

    private Engine engine;  // Car has Engine as its instance variable/property


    public Car(String make, String model, String color, String VIN, int noOfDoors, Engine engine) {
        super(make, model, color);
        this.VIN = VIN;
        this.noOfDoors = noOfDoors;
        this.engine = engine;
    }


    public static void main(String[] args) {


        Car car = new Car(
                "Toyota",
                "Supra",
                "White",
                "$%^CDCD%&CD*^%CD^&",
                2,
                new Engine("Toyota", "GRF-23232", 2023, 8) );
    }
}
