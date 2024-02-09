package day26;

public class ReverseString {






    public static String reverse(String str){

        StringBuilder reversed =  new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

     /*
      Create a method that reverses the String but keeps the order of spaces

      Ex:
       //I am living in California -> a in rofila Cn ignivilmaI
      */
    public static String reverseKeepingTheOrderOfSpaces(String str){


        // Reverse the chars by omitting spaces
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            if(str.charAt(i) != ' '){  // if the char is a space don't append to the stringbuilder
                reversed.append(str.charAt(i));
            }

        }

        // Iterate through original string and if the char is a space, insert space into a stringbuilder

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                reversed.insert(i, ' '); // insert space if the char at given index is a space
            }
        }

        return reversed.toString();
    }


    public static void main(String[] args) {


//        System.out.println(reverse("I am living in California"));

        System.out.println(reverseKeepingTheOrderOfSpaces("I am living in California"));
                                                             //a in rofila Cn ignivilmaI




    }
}
