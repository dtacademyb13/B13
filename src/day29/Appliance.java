package day29;

public class Appliance {

    public String publicVar;
    protected String protectedVar;
    String defaultVar;
    protected String serialNo;
    protected String make;


    // public ->  visible everywhere
    // protected ->  visible to all subclasses anywhere, typically protected keyword is used in superclasses that are intended to be extended
    // default ->  visible to all classes in the same package, also visible to subclasses everywhere
    // private -> visible only within the class


    protected void method1(){

    }

    protected void method2(){

    }
}
