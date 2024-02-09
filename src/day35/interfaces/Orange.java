package day35.interfaces;

public class Orange implements Edible, Commercializable{
    @Override
    public void howToEat() {
        System.out.println("Orange: make an orange juice");
    }

    @Override
    public void makeMoney() {
        System.out.println("Orange: grow it in an orchard.");
    }
}
