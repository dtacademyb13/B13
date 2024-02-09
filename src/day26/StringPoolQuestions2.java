package day26;

public class StringPoolQuestions2 {


    public static void main(String[] args) {


        String hello = "Hello";
        String lo = "lo";
        String helloLo = "Hel" + lo; //  +  with other objects creates a new object
        String helloLo2 = "Hel" + "lo"; //  +  with other objects creates a new object
        String helloLoLiteral = "Hello";
        String helloLoNew = new String("Hello");
        String helloLoIntern = helloLoNew.intern();
        // Question 1
        System.out.println("Is 'hello' == 'helloLo'? " + (hello == helloLo)); // false
        System.out.println("Is 'hello' == 'helloLo2'? " + (hello == helloLo2)); // true
        // Question 2
        System.out.println("Is 'hello' == 'helloLoLiteral'? " + (hello == helloLoLiteral)); //
//        // Question 3
        System.out.println("Is 'helloLo' == 'helloLoNew'? " + (helloLo == helloLoNew)); // false
//        // Question 4
        System.out.println("Is 'helloLoNew' == 'helloLoIntern'? " + (helloLoNew == helloLoIntern)); // false
//        // Question 5
        System.out.println("Is 'hello' == 'helloLoIntern'? " + (hello == helloLoIntern)); //true
//        // Question 6
        System.out.println("Is 'hello' == 'Hello'?" + (hello == "Hello")); // true
//        // Question 7
        System.out.println("Is 'helloLo'.equals('hello')? " + helloLo.equals(hello)); //

    }
}
