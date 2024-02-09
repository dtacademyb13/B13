package day16;

public class StringManipulation {


    public static void main(String[] args) {


        String str ="crazy crayfish crushing craniums";
        String searchTerm = "crazy";

        for (int i = 0; i <= str.length()-searchTerm.length(); i++) {
            System.out.println(str.substring(i, i+searchTerm.length()));
        }
    }
}
