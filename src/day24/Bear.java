package day24;

public class Bear {

    private String color;


    public static void main(String[] args) {

        System.out.println(new Bear().color); //inside the class all private members are accessible
    }

    public void printColor(){
        System.out.println(this.color);
        doSomething(); // private methods are typically used for internal operations of the class
    }


    private void doSomething(){

    }


}
