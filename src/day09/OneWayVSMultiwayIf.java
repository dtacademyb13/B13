package day09;

public class OneWayVSMultiwayIf {


    public static void main(String[] args) {
//
//        int score = 60;
//
//        if (score >= 90){
//            System.out.println("A");
//        }else if (score >= 80){
//            System.out.println("B");
//        }else if (score >= 70){
//            System.out.println("C");
//        }else if (score >= 60){
//            System.out.println("D");
//        }else{
//            System.out.println("F");
//        }


        System.out.println(getGrade(69));
    }


    public static String getGrade(int score){

        if (score >= 90){
            return "A";
        }else if (score >= 80){
            return "B";
        }else if (score >= 70){
            return "C";
        }else if (score >= 60){
            return "D";
        }else{
            return "F";
        }
    }
}
