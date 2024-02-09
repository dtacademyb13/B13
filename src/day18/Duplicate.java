package day18;

public class Duplicate {


    public static void main(String[] args) {


        // Using nested loops are sometimes useful to perform ceratin algorithms

       int [] arr = {29, 24, 84, 28, 69, 90, 90, 96, 45, 57, 25, 32, 69, 60, 51, 67, 12, 90, 76, 82};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ": ");
//            for (int j = i+1; j < arr.length; j++) {
//
//                System.out.print(arr[j] + " ");
//
//            }
//            System.out.println();
//
//        }


        // We can use it to find the duplicate

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate found: " + arr[j]);
                }


            }


        }


    }


    public static boolean hasDuplicate(int[] arr){


        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return true;
                }


            }


        }

        return false;
    }
}
