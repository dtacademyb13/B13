package day31.task;

public class Car extends Vehicle{

    private Integer numOfDoors;

    public Car(String make, String model, Integer year, Integer topSpeed, Integer numOfDoors) {
        super(make, model, year, topSpeed);
        this.numOfDoors = numOfDoors;
    }

    public Integer getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(Integer numOfDoors) {
        this.numOfDoors = numOfDoors;
    }


    public void drive(){
        System.out.println("The " + getMake() + " " + getModel() + " can drive up to "+getTopSpeed()+" mph and is currently driving. This car has "+numOfDoors+" doors.");
    }
}
