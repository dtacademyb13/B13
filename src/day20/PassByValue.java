package day20;

public class PassByValue {




    public static void main(String[] args) {



//        int a = 10;
//        decrement(a);
//        System.out.println("In the main method: a  is " + a);

        int a = 10;
        increment(a);
        System.out.println("In the main method: a  is " + a);

        // pass by value for primitives/immutable objects like String mean that when a variable is passed into a method, its copy(value) is passed,
        // so if a method changes the variable, the change does not affect the original variable
    }
    public static int increment(int num){
        ++num;
        return num;
    }

    public static void decrement(int num){
               --num; // what happens to the variable in the method?
        System.out.println("Local variable num: " + num);  // yes, local variable num is updated
    }





}
