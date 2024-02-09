package day13;

public class BreakDemo {

    public static void main(String[] args) {


        // print numbers 1-10

//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }

        // print numbers 100-1, only the evens

//        int i = 100;
//        while (i >= 1){
//
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//
//            i--;
//
//
//        }


        int i = 1;
        while (i <= 10){
            System.out.println(i);
            if (i == 6){
                break;

            }

            i++;
        }


    }
}
