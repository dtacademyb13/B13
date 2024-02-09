package day15;

public class NestedLoop {


    public static void main(String[] args) throws InterruptedException {


//        for (int i = 1; i <= 5; i++) {
//
//            System.out.print("Row: " + i + " -> ");
//
//            for (int j = 1; j <=6 ; j++) {
//                System.out.print(j + " ");
//                Thread.sleep(1000); // stops the execution for 1 sec
//            }
//
//            System.out.println();
//
//        }


        for (int i = 1; i <= 6; i++) {



            for (int j = 1; j <=8 ; j++) {
                System.out.print(j + " ");

            }

            System.out.println();



        }


    }
}
