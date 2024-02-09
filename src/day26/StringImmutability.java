package day26;

public class StringImmutability {

    public static void main(String[] args) {

        String str = "Java"; // created in String pool
//        str = "Python";
        String str2 =  new String("Java");

        System.out.println(str == str2 );

        String str3 = "Java";
        System.out.println(str == str3);

        String str4 = new String("Java");

        System.out.println(str2 == str4);

        System.out.println(str == str4);

        str4 = str4.intern();  //returns the reference to the string that is in the string pool

        System.out.println(str == str4);



        String str5 = new String("Python");
        String str6 = new String("Python");

        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));


        String str7 = "Hello";
        String str8 = "He".concat("llo"); // method call creates a new object and returns it

        System.out.println(str7 == str8); //

        String str9 = "Hello";
        String str10 = "He" + "llo"; //  + does not create a new object

        System.out.println(str9 == str10);




    }
}
