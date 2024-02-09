package day05;

public class CharType {


    public static void main(String[] args) {


        char ch = 'A';  // character format

        char ch1 = '\u0041'; // unicode format

        char ch2 = 65; // ascii decimal format

        System.out.println(ch1);
        System.out.println(ch2);


        char someChar = 289;
        System.out.println(someChar);

        String emoji = "\uD83D\uDE00";

        System.out.println(emoji);

        System.out.println("\uD83D\uDE14");

        System.out.println("\uD83D\uDE2D");


        //Escape characters

        System.out.println("T-800 said \"\"\"I will come back\"\"\"");


        System.out.println("hi\nmy\nname\nis\nt-800");

        String first = "Sarah";
        String last = "Connor";

        String description = "FIRST:" + first + "\n" +
                             "LAST:" + last;

        System.out.println(description);


        System.out.println("\\\\\\///");     //  \\\///

        String pathToAFile = "C:\\Users\\Nuclues\\Desktop\\First\\AboutMe.java";

        System.out.println(pathToAFile);

        System.out.println("First\tLast\tOccupation");
        System.out.println("Bob\t\tDoe\t\tDev");

    }
}
