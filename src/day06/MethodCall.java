package day06;

public class MethodCall {

    public static void main(String[] args) {

        printHello100Times();
    }


    public static void printHello5Times(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static void printHello25Times(){
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
    }

    public static void printHello100Times(){
        printHello25Times();
        printHello25Times();
        printHello25Times();
        printHello25Times();
    }
}
