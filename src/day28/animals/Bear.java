package day28.animals;

public class Bear extends Animal{

    String type;

    public void hibernate(){
        System.out.println("Hibernate");
    }


    public static void main(String[] args) {

        Bear bear = new Bear();
        bear.hibernate();
        System.out.println(bear.type);
        bear.hunt();
        bear.eat();
        bear.move();
        System.out.println(bear.color);
        bear.getLifeExpectancy();

        Object obj;

    }
}
