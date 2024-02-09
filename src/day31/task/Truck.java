package day31.task;

public class Truck extends Vehicle{

    private Integer cargoCapacity;

    public Truck(String make, String model, Integer year, Integer topSpeed, Integer cargoCapacity) {
        super(make, model, year, topSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    public Integer getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(Integer cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    public void drive(){
        System.out.println("The " + getMake() + " " + getModel() + " can drive up to "+getTopSpeed()+" mph and is currently driving. This truck has a cargo capacity of "+cargoCapacity+" lbs.");
    }

}
