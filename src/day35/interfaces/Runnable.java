package day35.interfaces;

//public final interface Runnable {  //doesn't work
//public abstract interface Runnable { // interfaces are implicitly abtsract
//private interface Runnable { // only public or deafult visibility
 public interface Runnable extends Operatable {  // interfaces can extend other interfaces

//    public static final int VALUE = 34;
     int VALUE = 34; // public static final are assumed for all interface variables


   // Interfaces do not have constructors

//   public Runnable(){}



     public abstract void run();
     void operate(); // public abstract is assumed
//     private final void operate(); // private,protected or final not allowed


    public default void methodthatHasaBody(){ // default methods in interfaces are methods with implementation
      // default methods can only exist in interfaces
        System.out.println(VALUE);
        staticMethodWithImplementation();

    }

    public static void staticMethodWithImplementation(){ // mainly for internal operations of the interface
        System.out.println(VALUE);
    }

    private void privateMethodWithImplementation(){ // Java 9 added private methods with implementation to support internal operations
        System.out.println("internal operation logic");
    }

    private static void privateMethodWithImplementationStatic(){}

    }
