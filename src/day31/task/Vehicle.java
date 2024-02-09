package day31.task;

public class Vehicle {

    private String make;
    private String model;
    private Integer year;
    private Integer topSpeed;

    public Vehicle(String make, String model, Integer year, Integer topSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }


    public void drive(){
        System.out.println("The vehicle can drive up to 80 mph and is currently driving");
    }


}
