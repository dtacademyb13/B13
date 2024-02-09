package day28.vehicles;

public class Car extends Vehicle{


    private boolean isAutomatic;
    private int noOfDoors;

    public Car(String color, String make, String model, boolean isAutomatic, int noOfDoors) {
        super(color, make, model);
        this.isAutomatic = isAutomatic;
        this.noOfDoors = noOfDoors;
    }

    //    public Car( String color, String make, String model, boolean isAutomatic, int noOfDoors) {
//        setColor(color);
//        setMake(make);
//        setModel(model);
//        super(color, make, model);
//        this.isAutomatic = isAutomatic;
//        this.noOfDoors = noOfDoors;
//    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }


    public static void main(String[] args) {

        Car car = new Car("black", "BMW", "M5", true, 4);
        System.out.println(car.getColor());
    }
}
