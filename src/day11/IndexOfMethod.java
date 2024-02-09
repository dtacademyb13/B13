package day11;

public class IndexOfMethod {

    public static void main(String[] args) {


        String str = "Leo loves veggie  and burgers loves burgers and cheese burgers";

        int indexOfL = str.indexOf('l');

        System.out.println(indexOfL);

        System.out.println(str.indexOf("burgers")); // the index of b

        System.out.println(str.indexOf('x')); //
        System.out.println(str.indexOf("Coke")); //

        System.out.println(str.lastIndexOf("burgers"));

        // indexOf has a version where you can indicate where to start the search from

        System.out.println(str.indexOf("burgers"));
        System.out.println(str.indexOf("burgers",18));


        int indexOfFirstBurgers = str.indexOf("burgers");
        System.out.println(str.indexOf("burgers",indexOfFirstBurgers+1));

        System.out.println(getInitials("Johnny Depp"));
        System.out.println(getInitials("Michael Jackson"));


        String str4 = "Leo loves veggie  and burgers loves burgers and cheese burgers";

//        System.out.println(str4.replace("l", "x"));
        System.out.println(str4.replace(" ", ""));
    }

    /*
      This method should take a full name such as John Doe and return the initials JD

     */
    public static String getInitials(String fullName){

        //John Doe
        char first = fullName.charAt(0);
        int indexOfSpace = fullName.indexOf(" ");
        char second = fullName.charAt(indexOfSpace+1);

        return "" + first + second;


    }
}
