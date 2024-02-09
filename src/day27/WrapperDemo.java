package day27;

import java.util.List;

public class WrapperDemo {


    public static void main(String[] args) {


        int[] arr;

//        List<Integer> list;

        int num = 78;

//        Integer number = new Integer(45);
        Integer number = 67; //
        Boolean bool = true;
        Long l = 67L;
        Character ch  = '$';
        Double d = 9.8;

        // Max and min value

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int number2  = 2147483647 + 10; // integer overflow
        System.out.println(number2);

        performAddition(2147483647, 23);


        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println((int)Character.MAX_VALUE); // 65535
        System.out.println((int)Character.MIN_VALUE); // 0


        int[] array = {3,4,6,1,2,89,2,45};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int each : array) {
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }
        }

        System.out.println(max);
        System.out.println(min);



//        int num2 = Integer.MAX_VALUE;
//        System.out.println(num2 + 232);


    }





    public static void performAddition(int a, int b){
        // check for overflow/underflow using these
        if(a + b > Integer.MIN_VALUE){
            System.out.println("Addition will result in incorrect value");
        }else{
            System.out.println(a + b);
        }

    }
}
