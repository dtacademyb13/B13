package day16;

public class FindMinMax {


    public static void main(String[] args) {


        int[] arr = {68, 50, 0, 20, 69, 60, 76, 64, 97, 39, 93, 67, 51, 732, 90, 64, 2};

        // assume the first values as MAX
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length ; i++) {

              if(arr[i] > max){ // if the arr[i] is greater than current max
                 max = arr[i];   // update the max with the new max
              }

              if(arr[i] < min){ // if the arr[i] is less than current min
                    min = arr[i];   // update the min with the new min
              }

        }

        System.out.println("The max is " + max);
        System.out.println("The min is " + min);







    }
}
