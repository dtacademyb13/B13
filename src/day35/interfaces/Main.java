package day35.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {




//        Edible edible1 = new Edible(); //'Edible' interface is abstract; cannot be instantiated

//        Edible edible = new Chicken();
//        edible.howToEat();
//
//        List<Edible> edibleList = new ArrayList<>();
//        edibleList.add(new Chicken());
//        edibleList.add(new Apple());
//        edibleList.add(new Orange());
//        edibleList.add(new IceCream());
//        edibleList.add(new IceCream());
//
//        for(Edible edible1: edibleList){
//            edible1.howToEat();
//        }

        displayEatingBehavior(new IceCream());
        displayEatingBehavior(new Chicken());
        displayEatingBehavior(new Apple());

      Edible edible =  returnSomethingEdible();
      System.out.println(edible.getClass());


        System.out.println(Runnable.VALUE);


        List list = new ArrayList();


    }



    public static void displayEatingBehavior(Edible edible){
        edible.howToEat();
    }

    public static Edible returnSomethingEdible(){
        return new Apple();
    }
}
