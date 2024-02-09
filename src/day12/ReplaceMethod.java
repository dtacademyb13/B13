package day12;

public class ReplaceMethod {


    public static void main(String[] args) {

        String str = "     Leo loves burgers and shakes and fries and drinks   ";

//        System.out.println(str.replace('o','u'));
//
//        System.out.println(str.replace("and","&"));
        System.out.println(str.replace("and",""));

        System.out.println("   a $b   $c   $d   ".replace(" ","").replace("$", ""));


        String finalRes = str.toUpperCase().concat("dsd").substring(6).replace("AND", "OR").trim();

        System.out.println(finalRes);


        if(!str.isEmpty()){
            System.out.println("Perform some operation");
        }


        String s = "x";

        String repeat = s.repeat(1000);

        System.out.println(repeat);


        // Convert a number to a String

        int i = 78;

        String myNum = "" + i;
        String str3 = String.valueOf(i);
        System.out.println(str3);

        // String price = "2310";

        String price = "2310";

        int num = Integer.parseInt(price);
        double num2 = Double.parseDouble("34.21");


        System.out.println(num * 0.06);
    }
}
