package day31.animals;

public class Snake extends Animal{

    boolean shedsSkin;

    public Snake(String color, double weight, boolean shedsSkin) {
        super(color, weight);
        this.shedsSkin = shedsSkin;
    }


//    public void move(){
//        System.out.println("Snake is crawling");
//    }
//
//
//    public void eat(){
//        System.out.println("Snake is eating a mouse");
//    }
//
//    public void makeSound(){
//        System.out.println("Snake is hissing");
//    }
}
