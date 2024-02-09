package day14;

public class CharacterClassUseCase {


    public static void main(String[] args) {



        String str = "Leo loves burgers";

        //

        System.out.println(getAllLowercase(str));

        String str2 = "*$hi %2&3hola hi$b32, 4hello76%@.";

        System.out.println(cleanString(str2));


    }

    public static String cleanString(String str){
        String collect = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                collect+=ch;
            }

        }

        return collect;
    }



    public static String getAllLowercase(String str){
        String collect = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                collect+=ch;
            }

        }

        return collect;
    }


}
