package day26;

public class Demo {

    public static void main(String[] args) {



        String str  = "dssd";
        StringBuilder sb =  new StringBuilder("dssd");

        if(str.equals(sb)){ // equals always returns false for objects of different type
            System.out.println("True");
        }


        StringBuilder sb2 =  new StringBuilder("dssd");
        System.out.println(sb == sb2); // false because they are 2 separate objects
        System.out.println(sb.equals(sb2)); // false, because equals() method's logic which compares the content is NOT implemented for StringBuilder
        System.out.println(sb.compareTo(sb2) == 0); // to check equality use compareTo or convert both to String
    }
}
