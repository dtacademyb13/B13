package day28.animals;

public class PolarBear extends Bear{

    boolean canSwim;

    public void dive(){
        System.out.println("Diving");
    }

    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
        polarBear.eat(); // Animal method
        polarBear.hibernate(); // Bear method
        polarBear.dive(); // PolarBear method
    }

}
