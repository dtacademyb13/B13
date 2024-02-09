package day09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicalOps2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?:");

        int age = scanner.nextByte();

        System.out.println("Are you dressed according to the dress code? (yes/no):");

        String  dressCodeAnswer = scanner.next();

        System.out.println("Are you on the guestlist? (yes/no):");

        boolean onGuestList = scanner.next().equals("yes");

//        boolean isQualified = age >=21 && (dressCodeAnswer.equalsIgnoreCase("yes") || dressCodeAnswer.equalsIgnoreCase("yeah")); //yeah
        boolean isQualified = age >=21 && dressCodeAnswer.equalsIgnoreCase("yes") && onGuestList; //yeah

        if (isQualified){
//        if ( age >=21 && dressCodeAnswer.equals("yes")){
            System.out.println("Welcome to Flash!");
        }else{
            System.out.println("Sorry, you didn't meet one or both requirements");
        }


    }


}
