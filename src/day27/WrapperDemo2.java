package day27;

public class WrapperDemo2 {


    public static void main(String[] args) {


        Integer num = 78;
        double v = num.doubleValue();
        System.out.println(v);
        System.out.println(num.byteValue());
        System.out.println(num.longValue());


        // All numeric wrappers support conversion methods that convert String into a number

        // parse() and valueOf()

        String price = "34.56";

        // 6 percent tax

        double primitiveDouble = Double.parseDouble(price);
        Double objectDouble = Double.valueOf(price);

        System.out.println(primitiveDouble * 6.0/100);

        System.out.println(Integer.parseInt("2356621") / 20);
        System.out.println(Integer.valueOf("2356621"));

        // Conversion of numeric type to String

        String string = primitiveDouble + "";
        String string2 = 56 + "";
        String string3 = String.valueOf(67);


        System.out.println(reverseInt(123456));


//        System.out.println(Integer.parseInt("$23")); //NumberFormatException
//        System.out.println(Integer.parseInt("23.56")); //NumberFormatException
//        System.out.println(Double.parseDouble("23.56")); //NumberFormatException
//        System.out.println(Double.parseDouble("23")); //NumberFormatException
//        System.out.println(Long.parseLong("23L")); //NumberFormatException
//        System.out.println(Integer.parseInt("325646327472354723")); //NumberFormatException
        System.out.println(Long.parseLong("325646327472354723")); //

        System.out.println(Character.isLetterOrDigit('a'));
        System.out.println(Character.isLetterOrDigit('5'));
        System.out.println(Character.isLetterOrDigit('&'));




    }




    public static int reverseInt(int num){
       return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }


}
