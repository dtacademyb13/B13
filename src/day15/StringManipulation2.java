package day15;

public class StringManipulation2 {


    public static void main(String[] args) {



        String str = "1alpha2beta3gamma4theta5zeta6omega7epsilon";
        //Find if the numbers in this string are sorted in ascending order

        //1. Find all the numbers

        String allNumbers = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                allNumbers += str.charAt(i);
            }
        }

        System.out.println(allNumbers);

        // boolean flag
        // boolean variable that tracks ceratin condition in a loop and updated when a condition is met

        boolean isSorted = true;

        for (int i = 0; i < allNumbers.length()-1; i++) {

           char first = allNumbers.charAt(i); //int first = Integer.parseInt(first+"");
           char second = allNumbers.charAt(i+1);

           if (first > second){
               isSorted = false;
               break;
           }
        }



        System.out.println(isSorted ? "Sorted" : "Not sorted");













    }
}
