package day28;

public class MethodOverloadingCallOrder {




    public static void substring(int start){

    }

    public static void substring(int start, int end){

    }

//    public static void sort(int num){
//
//        System.out.println("int");
//    }

    public static void sort(short num){

        System.out.println("short");
    }

    public static void sort(long num){

        System.out.println("long");
    }

    public static void sort(float num){
        System.out.println("float");
    }
    public static void sort(double num){
        System.out.println("double");
    }

    public static void main(String[] args) {

//        substring(3);
//        substring(3,4);
        sort(3);
        sort((short)3);
//        sort(3.0);
    }






}
