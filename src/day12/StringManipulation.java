package day12;

import java.util.Scanner;

public class StringManipulation {


    public static void main(String[] args) {

    /*

      Business Card Formatter
        In the age of networking, business cards are exchanged more often than ever.
        However, different people might provide their details in various formats. To bring consistency and make it easier to catalogue, we want to standardize the format of the details.
        Objective:
        Develop a program that takes the raw details from a business card and formats them in a consistent manner.
        Steps:
        Create methods for:
        formatName(String name): Converts the name to title case (e.g., “jOhN dOE” becomes “John Doe”).
        formatPhone(String phone): Ensures the phone number is in the format “(XXX) XXX-XXXX”.
        formatEmail(String email): Converts the email to lowercase.
        In the main method:
        Prompt the user to enter their full name, phone number, and email.
        Format the details using the respective methods.
        Display the standardized business card details.
        Example:
        Enter your full name: jOhN dOE
        Enter your phone number: 1234567890
        Enter your email: JOHNDOE@GMAIL.COM
        Formatted Business Card:
        Name: John Doe
        Phone: (123) 456-7890
        Email: johndoe@gmail.com



     */

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the full name: ");

        String full =  scanner.nextLine();

        System.out.println("Enter the phone: ");

        String phone =  scanner.nextLine();

        System.out.println("Enter the email: ");

        String email =  scanner.nextLine();


        System.out.println("Full Name: " + formatName(full));
        System.out.println("Phone: " + formatPhone(phone));
        System.out.println("Email: " + formatEmail(email));







    }

    public static String formatName(String name){
        name = name.toLowerCase();
        int indexOfSpace = name.indexOf(" ");
        String first = name.substring(0,indexOfSpace);
        String last = name.substring(indexOfSpace + 1);

        String firstCharFirst = first.substring(0,1).toUpperCase();
        String firstCharLast = last.substring(0,1).toUpperCase();

       return firstCharFirst + first.substring(1)  + " " + firstCharLast + last.substring(1);




    }
    public static String formatPhone(String phone){
         //1234567890  ->  (123) 456-7890

        String first = phone.substring(0,3);
        String second = phone.substring(3,6);
        String three = phone.substring(6);

        return  "(" + first + ") " + second + "-" + three;
    }

    public static String formatEmail(String email){
        return email.toLowerCase();
    }

}
