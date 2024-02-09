package day36;

import java.util.*;

public class Car {

   // implement the car class

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

class Main{


    public static void main(String[] args) {


        List<Car> cars =  new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            cars.add(new Car( new Random().nextInt(200)));
        }

        cars.forEach(System.out::println);

       Car carWithMaxSpeed =  findTheCarWithTheMaxSpeed(cars);

        System.out.println("The car with the max speed is: " + carWithMaxSpeed);

        Car carWithMinSpeed =  findTheCarWithTheMinSpeed(cars);

        System.out.println("The car with the max speed is: " + carWithMinSpeed);
    }

    public static Car findTheCarWithTheMaxSpeed(List<Car> cars){
//        cars.sort(Comparator.comparingInt(Car::getSpeed));
        cars.sort((a,b) -> a.getSpeed() - b.getSpeed());
        return cars.get(cars.size()-1); //get the last car object
    }
    public static Car findTheCarWithTheMinSpeed(List<Car> cars){
//        cars.sort(Comparator.comparingInt(Car::getSpeed));
        cars.sort((a,b) -> a.getSpeed() - b.getSpeed());
        return cars.get(0); //get the first car object
    }
}
