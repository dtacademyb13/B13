package day11;

public class StringImmutability {


    public static void main(String[] args) {



        String str = "dog";

        str.concat(" saw");
       str.concat(" a cat");
        str.toLowerCase();
       str.toUpperCase();

        //str = str.concat(" saw");
        //        str = str.concat(" a cat");
        //        str = str.toLowerCase();
        //        str = str.toUpperCase();

        System.out.println(str);


    }
}
