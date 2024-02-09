package day13;

public class WhileLoop {


    public static void main(String[] args) {



//        int i = 0;
//        while (i < 100){
//            System.out.println("Hello");
//            i++;
//        }


//        for (int i = 0 ; i < 10 ; i++ ) {
//            System.out.println("Hello");
//            System.out.println("Hi");
//        }

//        for (int i = 99; i >=0 ; i--) {
//            System.out.println(i);
//        }

//        for ( ;; ) {
//
//        }

        // iterate through a String


        String str = "leo loves burgers";


//        for (int i = 0; i < str.length(); i++) {
//            char each = str.charAt(i);
//
//            if(!"eaiouEAIOU".contains(each+"")){
//                System.out.print(each);
//            }
//        }


        System.out.println( getVowels("Hello World"));

        // Hello World -> dlroW olleH



    }

    public static String getVowels(String str){
        String vowels = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if("eaiouEAIOU".contains(each+"")){
               vowels += each;
            }
        }

        return  vowels;

    }
}
