package day27;

public class AutoboxAndUnbox {


    public static void main(String[] args) {

        Integer num = Integer.valueOf(34);

        int someNum = 78;
        Integer num2 = 56; // new Integer(56)
        Integer num3 = someNum;

        int primInt = num;
//        int anotherPrim = new Integer(45); // autounboxing of an object to a primitive

        Double d = 56.7;
//        double d3 = 67;
//
//        Double d2 = 67;
//         float f = 4.5;
        Float f = 4.5F;

//        long l1 = 56;
//        Long l1 = 56; // new Integer(56);

        Integer x = 3 + Integer.valueOf(3);
        int y = Integer.valueOf(3) + Integer.valueOf(3);
    }
}
