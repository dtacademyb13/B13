package day10;

public class UsingSwitchWithReturnValues {


    public static void main(String[] args) {


        System.out.println(  getMessage("Saturday") );



    }


    public static String getMessage(String day){

        switch (day) {

            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                return "Working hard!";
            case "Friday":
            case "Saturday":
                return "It's the weekend, let's party!";
            case "Sunday":
                return "Let's get ready for the next week!";
            default:
               return  "Invalid day";


        }
    }
}
