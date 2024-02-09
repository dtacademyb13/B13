package day35.interfaces;

public class IceCream implements Edible, Commercializable{
    @Override
    public void howToEat() {
        System.out.println("IceCream: Make an ice cream shake");
    }

    @Override
    public void makeMoney() {
        System.out.println("IceCream: Sell it in a ice cream truck");
    }
}
