package day04;

public class SwapVariableValues {

    public static void main(String[] args) {

        // Given x and y, swap their values


        int x = 11;
        int y = 22;

        // swap
        int temp = x;  // store one of the variable's value in a third variable, in this case x
        x = y; // then we can safely overwrite the value of x with y
        y = temp; // original x's value is in temp, we assign it to y


        System.out.println(x);// 22
        System.out.println(y);// 11


    }
}
