package day12;

public class CounterControlledWhileLoop {


    public static void main(String[] args) {



        // Counter controlled loops have 3 items:

        // 1. counter variable
        int i = 0;

        // 2. a condition that ends the loop when it becomes false

        while (i < 100) {  // iteration
            System.out.println("Loops: " + i);
            i++;   // 3. update statement that increments the variable
        }

        System.out.println("The value of i after the loop:" + i);




    }
}
