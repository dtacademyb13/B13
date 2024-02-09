package day13;

public class ContinueDemo {

    public static void main(String[] args) {



//        int i = 1;
//        while (i <= 10){
//
//            if(i == 6){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//
//            i++;
//        }


        int j = 1;
        while (j <= 100){

            if(j % 2 ==0 ){
                j++;
               continue;
            }
            System.out.println(j);

            j++;
        }


    }
}
