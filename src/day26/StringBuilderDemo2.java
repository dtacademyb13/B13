package day26;

public class StringBuilderDemo2 {


    public static void main(String[] args) {


//        StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World").append(" Hi").append(" Universe");

        System.out.println(sb);

        sb.append(2023).append(true).append('X').append(new char[]{'b', 'y', 'e'});

        System.out.println(sb);

        sb.delete(0, 3);  //deletes 0,1,2

        System.out.println(sb);

        sb.delete(1,1);
//        sb.delete(1,0); //StringIndexOutOfBoundsException

        System.out.println(sb);

        System.out.println(sb.length());
        sb.delete(sb.length()-3, sb.length());
        System.out.println(sb);

        sb.deleteCharAt(0);
        sb.deleteCharAt(1);

//        while(sb.length()!=0){
//            sb.deleteCharAt(0);
//        }

        System.out.println(sb);

        sb.insert(1,"ff");
        System.out.println(sb);
        sb.insert(0,"Greetings ");
        System.out.println(sb);

        sb.replace(0,5,"Webd");

        System.out.println(sb);

        sb.setCharAt(sb.length()-1, 'Y');

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


       StringBuilder stringBuilder = new StringBuilder();

       stringBuilder
               .append("Java")  //
               .append(2024)
               .insert(4,"Python")    //JavaPython2024
               .delete(stringBuilder.length()-3, stringBuilder.length())  ///JavaPython2
               .replace(0,3,"Guav") //GuavaPython2
               .reverse();

        System.out.println(stringBuilder); //GuavaPython2    2nohtyPavauG

        // To convert SB into a String
        String string = stringBuilder.toString();
        // String to SB
        String str = "hi";
        StringBuilder newOne = new StringBuilder(str);

        stringBuilder = new StringBuilder("Bootcamp");
        for (int i = 0; i < stringBuilder.length(); i++) {
//            System.out.println(stringBuilder.charAt(i));
            System.out.println(stringBuilder.substring(i));
        }



//        new StringBuilder("Hello").append(" Hi").substring(2).append("dsd");


        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.substring(2); // substring does not modify the stringbuilder but returns a new String object
        sb3.deleteCharAt(0);
        System.out.println(sb3);



    }
}
