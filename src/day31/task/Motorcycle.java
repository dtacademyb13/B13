package day31.task;

public class Motorcycle extends Vehicle{

    private Boolean hasSideCar;

    public Motorcycle(String make, String model, Integer year, Integer topSpeed, Boolean hasSideCar) {
        super(make, model, year, topSpeed);
        this.hasSideCar = hasSideCar;
    }

    public Boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(Boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void drive(){
        System.out.println("The " + getMake() + " " + getModel() + " can drive up to "+getTopSpeed()+" mph and is currently driving. This motorcycle "+ (hasSideCar ? "has" : "does not have") +" a sidecar");
    }
}
