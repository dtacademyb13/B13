package day28;

public class AmbiguousCall {




    public static void substring(int start, double end){

    }

    public static void substring(double start, int end){

    }

    public static boolean assertEquals(int a, int b){
          return  a == b;
    }

    public static boolean assertEquals(Integer a, Integer b){
        return  a.equals(b);
    }


    public static void main(String[] args) {

//        substring(4,5); // Ambiguous method call

        System.out.println(assertEquals(4,5));
        System.out.println(assertEquals(Integer.valueOf(5),Integer.valueOf(5)));

        int first = 4;
        Integer second = 4;
//        assertEquals(first,second);  // if one is primitive and other is Wrapper you get an ambiguous call compiler error
        assertEquals(Integer.valueOf(first), second);  // fix: make both Wrapper
        assertEquals(first,  second.intValue() ); // make both primitive

    }





}
