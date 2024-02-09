package day26;

public class StringBuilderDemo3 {


    public static void main(String[] args) {


//        StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.length()); //0
        System.out.println(sb.capacity()); //16

        sb.append("aaaaaaaaaaaaaaaaaaaa");

        System.out.println(sb.length()); //20
        System.out.println(sb.capacity()); //(16+1)*2 -> 34


        StringBuffer stringBuffer = new StringBuffer("dsdssdcdsd");
        stringBuffer.append("ds").delete(0, 2);

        // StringBuffer is the same as StringBuilder except its methods are synchronized/thread-safe
        // You would only need it in a multithreaded applications




    }
}
