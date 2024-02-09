package day28.constructorChaining;

public class Child extends Parent{

     public Child(){
          super(4);
     }

     public Child (String str){
          // super();  // every constructor in Java has an implicit super() call to super class's no-arg constructor if there is no EXPLICIT super() or this()
          super(4);  // constructor can have either this() or super() but not both, if none provided explictly, an implicit super() is added
//          this();

     }

}
