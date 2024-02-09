package day28.constructorChaining;

public class Son extends Dad{

    public Son(){
        // super();
        System.out.println("Son constructor");
    }


    public static void main(String[] args) {

        Son son = new Son();
        // Constructor chaining -> each constructor always executes its super class's constructor tasks before its own
    }
}
