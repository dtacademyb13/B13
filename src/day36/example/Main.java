package day36.example;

public class Main {


    public static void main(String[] args) {


        eatSomething(new Apple());
        eatSomething(new Chicken());
        eatSomething( () -> {});
        eatSomething( () -> System.out.println("Make an orange juice") );
        eatSomething( () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Make chocolate drink");
            }
        } );


    }


    public static void eatSomething(Edible edible){
        edible.eat();
    }
}
