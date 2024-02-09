package day14;

public class ForLoopSyntax {


    public static void main(String[] args) {

        String str = "HelloWorld";
        // HdellrlooW

         String collect = "";
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {

            char start =str.charAt(i);
            char end =str.charAt(j);

            collect= collect + start+end;

        }

        System.out.println(collect);
    }
}
