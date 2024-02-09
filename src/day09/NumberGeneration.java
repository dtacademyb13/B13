package day09;

public class NumberGeneration {


    public static void main(String[] args) {



        // 16 digit number


        System.out.println("3" + (100000000000000L +  (long)(Math.random()*9000000000000000L)));


        System.out.println(getRandom(-21));

    }


    public static String getRandom(long i){
        if(i == 1){
            return "3" + (100000000000000L +  (long)(Math.random()*9000000000000000L));
        }else if (i > 1){
            return "0";
        }else {
            return "1";
        }
    }
}
