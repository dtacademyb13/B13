package day26;

public class StringBuilderDemo {


    public static void main(String[] args) {


//        StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("sb: " + sb);

//        String str =  new String("Hello");
//        str = str.concat(" World");
//        System.out.println("str: " + str);


        String str = "Hello World";
//        String reversed = "";
        StringBuilder reversed =  new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed);

//        StringBuilder sb2 = "ncdsbhjd";










    }
}
