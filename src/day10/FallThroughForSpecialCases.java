package day10;

public class FallThroughForSpecialCases {


    public static void main(String[] args) {


        String day = "Friday";

        switch (day){

        }

        switch (day) {

            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("Working hard!");
                break;

            case "Friday":
            case "Saturday":
                System.out.println("It's the weekend, let's party!");
                break;

            case "Sunday":
                System.out.println("Let's get ready for the next week!");
                break;

            default:
                System.out.println("Invalid day");
                break;

        }

    }
}
