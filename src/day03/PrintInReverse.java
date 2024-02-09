
package day03;

public class PrintInReverse {



    public static void main(String[] args) {




        // Given a 3 digit number, print that number in reverse
        // 123 -> 321
        // 463 -> 364

        // We can use  % and division operators for that purpose
        // % 10 to extract the last digit
        // / 10 to remove the last digit


//        System.out.println(123 % 10);  //3 -> obtain the last digit
//        System.out.println(123 / 10);  // 12 -removes the last digit


        int number = 678;
        int lastDigit = number % 10; // obtain last digit 3
        number = number / 10;  // get rid of last digit

        int secondDigit = number % 10; // 2
        number = number / 10; // 1

        int firstDigit = number % 10; // 1

        System.out.println("The reverse is " + lastDigit + secondDigit + firstDigit);



    }
}
