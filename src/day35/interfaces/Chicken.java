package day35.interfaces;

public class Chicken implements Edible, Commercializable{
    @Override
    public void howToEat() {
        System.out.println("Chicken: make a fried chicken");
    }

    @Override
    public void makeMoney() {
        System.out.println("Chicken: sell eggs");
    }
}
