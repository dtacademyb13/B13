package day24;

public class Product {

    String name;
    double price;

    final static String COMPANY_NAME = "Amazon";
    static int countOfProducts = 0;


    public void printInfo(){
        System.out.println(price); // instance method can access  instance variable
        System.out.println(COMPANY_NAME); // instance method can access  static variable
        System.out.println(getName());  // instance method can call another instance method
        System.out.println(getCountOfProducts());  // instance method can call static method
    }

    public String getName(){
        return name;
    }

    public static int getCountOfProducts(){
        return countOfProducts;
    }


    public static void helperMethod(){
//        System.out.println(price); // static method cannot access an instance variable directly
        //Non-static field 'price' cannot be referenced from a static context
        System.out.println(COMPANY_NAME); // static method  can access  static variable
//        System.out.println(getName());  // static method cannot call another instance method
        //Non-static method 'getName()' cannot be referenced from a static context
        System.out.println(getCountOfProducts());  // static method  can call static method
    }

}
