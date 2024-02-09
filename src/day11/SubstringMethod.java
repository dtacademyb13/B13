package day11;

public class SubstringMethod {


    public static void main(String[] args) {


        String str =  "Leo loves burgers";

        String substring = str.substring(0, 3);

        // second index is not part of substring

        System.out.println(substring);

        System.out.println(str.substring(4, 9));

        System.out.println(str.substring(4));

//        System.out.println(str.substring(2, 0)); // StringIndexOutOfBoundsExceptio
        System.out.println(str.substring(2, 2)); // empty string

        String str2 = "dog";

        System.out.println(str2.substring(0,3));
//        System.out.println(str2.substring(0,4));
//        System.out.println(str2.charAt(3));

        String str3 = "Exceptionalism";

        System.out.println(str3.substring(5,9));
        System.out.println(str3.substring(5));
        System.out.println(str3.substring(str3.length()-4));

    }
}
