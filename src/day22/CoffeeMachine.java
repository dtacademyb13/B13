package day22;

public class CoffeeMachine {

    String brand;
    double capacity;
    String color;

    // Default Constructor
    // A class gets a default constructor with no-arg and empty body when there is NO constructor at all
    // Syntax ->  public CoffeeMachine(){}
    // Adding any constructor of your own will prevent default constructor being added

    //
     public CoffeeMachine(){

     }


    public CoffeeMachine(double capacity1){
        capacity =  capacity1;
    }

    public void printInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(2.3);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine();
    }


}
