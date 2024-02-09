package day14;

public class CharacterClassDemo {


    public static void main(String[] args) {

        char ch = 'a';

        //Character character = Character.valueOf('a');


        boolean digit = Character.isDigit(ch);

        System.out.println(digit);
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('X'));
        System.out.println(Character.isLetter('@'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLetterOrDigit('d'));
        System.out.println(Character.isLetterOrDigit('$'));
        System.out.println(Character.isLetterOrDigit(' '));
        System.out.println(Character.isLetterOrDigit(','));

        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('s'));
        System.out.println(Character.isUpperCase('6'));
        System.out.println(Character.isLowerCase('7'));
        System.out.println(Character.isLowerCase('x'));
        System.out.println(Character.isLowerCase('&'));


        if(!Character.isDigit('s')){
            System.out.println("Not a digit");
        }

        char ch4 = Character.toUpperCase('c');
        System.out.println(ch4);

        System.out.println(Character.toLowerCase('F'));

    }


}
