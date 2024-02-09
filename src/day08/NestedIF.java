package day08;

public class NestedIF {

    public static void main(String[] args) {


        int num = -22;


        if(num >=0 ){
            System.out.println("Positive");

            if(num % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }

        }else {
            System.out.println("Negative");

            if(num % 3 == 0){
                System.out.println("Divisible by 3");
            }else{
                System.out.println("Not divisible by 3");
            }
        }


    }
}
