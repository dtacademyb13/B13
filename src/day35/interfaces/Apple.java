package day35.interfaces;

public class Apple implements Edible, Commercializable{

    public void howToEat(){
        System.out.println("Apple: Make an apple pie");
    }

    @Override
    public void makeMoney() {
        System.out.println("Apple: Make an apple cider");
    }
}
