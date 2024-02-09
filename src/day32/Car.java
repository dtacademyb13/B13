package day32;

import java.util.Objects;

public class Car {


    private String make;
    private String model;
    private double speed;

    public Car(String make, String model, double speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }


//    @Override
//    public boolean equals(Object obj){
//        if( this == obj){
//            return true;
//        }
//        if(! (obj instanceof Car) ){
//            return false;
//        }
//        Car car = (Car) obj;
//        return  this.make.equals(car.make) && this.model.equals(car.model);
////        return  Double.compare(this.speed, car.speed) == 0;
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model);
    }
}
