package day29.overriding;

public class Sub extends Super{

    String name =  "Bob";

    public void printSomething(){
        System.out.println("Hi");
    }

    public void testSuperKeyword(){
//        System.out.println(name);
        System.out.println("This:" + name);
        System.out.println("Super: " + super.name);
        printSomething();
        super.printSomething();

    }


    public static void main(String[] args) {
        new Sub().testSuperKeyword();
    }

}
