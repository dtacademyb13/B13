package day25;

public class Immutability {

    public static void main(String[] args) {


        // Immutability -> once the object is created with initial value, that initial object with its value cannot be changed
        String str =  new String("Java");
        str.toUpperCase();
        System.out.println(str);

        // Omitting setter methods makes the class immutable
        MyString myString = new MyString("Java");
        myString.getInitialValue();




    }
}
