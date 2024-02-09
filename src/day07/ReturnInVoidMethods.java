package day07;

public class ReturnInVoidMethods {


    public static void main(String[] args) {

        printDivisionResult(10,5);
    }


    public static void printDivisionResult(int a, int b){

        if(b == 0){
            return;   // as soon as execution comes to the return statement, the method ends
        }
        System.out.println(a/b);

    }
}
