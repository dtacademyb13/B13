package day06;

public class MethodParameter {


    public static void main(String[] args) {

      String str = "Hello world";
//        printHello();
        printMyMessage("Au revoir!"); // when calling method, we pass arguments
        printMyMessage("Buenas tardes!");
//        printMyMessage(); // since you declared method parameter as String, not passing any parameter will fail
//        printMyMessage(34); // since you declared method parameter as String, passing int parameter will fail
        printMyMessage("Hola"); // you can call the method with literal values
        printMyMessage(str); // or you can call the method by passing a variable
    }

    public static void printMyMessage(String message){  // String message -> method parameter
        System.out.println(message);
    }

    public static void printHello(){
        System.out.println("Hello");
    }


}
