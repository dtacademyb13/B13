package day22;

public class VirtualPet {

    /*
    Virtual Pet Simulator
Background:
In the virtual pet simulator, you will design a class that represents a pet. The class will have instance variables to keep track of the pet's state (like hunger and happiness) and instance methods to interact with the pet (like feeding it or playing with it).
Objective:
Create a Java program that simulates taking care of a pet. Users can feed the pet, play with it, and check its status.

Class Requirements:

Instance Variables:
name: a String to store the pet's name.
hunger: an int to track the pet's hunger level. The higher the number, the hungrier the pet.
happiness: an int to track the pet's happiness level. The higher the number, the happier the pet.

Constructors:

VirtualPet(String name): Initializes a new pet with the given name, and sets the default hunger and happiness levels.

Instance Methods:
feed(): Decreases the pet's hunger level by 10. It should not allow the hunger level to go below 0.
play(): Increases the pet's happiness level by 10. It should not allow the happiness level to go above 100.
status(): Prints out the pet's current hunger and happiness levels.

VirtualPetSimulator Main Method Logic:
Initialize a Scanner object to read input from the console.
Prompt the user for their pet's name.
Create a VirtualPet object named myPet using the name provided by the user.
Set the initial hunger and happiness levels for myPet using the constructor.
Enter a loop that will continue until the user decides to exit:
Prompt the user for what they would like to do (feed, play, status, exit).
Use a switch-case or if-else statements to handle the input commands:
If 'feed', call the feed() method on myPet.
If 'play', call the play() method on myPet.
If 'status', call the status() method on myPet.
If 'exit', print a goodbye message and terminate the loop.
For any other input, prompt the user again.
After exiting the loop, close the Scanner object.
     */


    String name;
    int hungerLevel;
    int happinessLevel;


    public VirtualPet(String name){
        this.name = name;
        this.happinessLevel = 50; //default levels
        this.hungerLevel = 50; //default levels
    }

    public VirtualPet(String name, int hungerLevel, int happinessLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
    }

    public void feed (){
        hungerLevel = hungerLevel - 10;
        if(hungerLevel<0){
            hungerLevel = 0;
        }
        System.out.println(name + " has been fed. The hunger level is " + hungerLevel);
    }

    public void play (){
        happinessLevel +=  10;
        if(happinessLevel>100){
            happinessLevel = 100;
        }
        System.out.println(name + " has been entertained. The happiness level is " + happinessLevel);
    }



    public void status (){
        System.out.println("VirtualPet{" +
                "name='" + name + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", happinessLevel=" + happinessLevel +
                '}');
    }
}
