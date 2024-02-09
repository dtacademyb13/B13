package day06;

public class MethodParameter2 {


    public static void main(String[] args) {


//        multiply10By10();
        multiply(10, 34);
        multiply(2, 234);
        multiply(0, 0);

        Math.random();  // random does not require any parameter because of  its logic
        Math.pow(2,10);
        Math.sqrt(34);

        printWinner("Bob", 2);
//        printWinner(1, "Alice"); // order of parameters should match

        calculateCube(4.5);
        calculateCube(5); // argument can be of the same type or compatible type
    }

    public static void multiply(int a, int b){ // each parameter needs to have their own type
        System.out.println( a * b);
    }

    public static void multiply10By10(){
        System.out.println(10 * 10 );
    }


    public static void printWinner(String name, int position){
        System.out.println(name + " won the " + position + "-place");
    }


    public static void calculateCube(double num){
        System.out.println(num*num*num);
    }


}
