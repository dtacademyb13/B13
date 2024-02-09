package day16;

public class AmericanFlag {


    public static void main(String[] args) {





        for (int i = 0; i< 13; i++){

            for(int j =0; j< 50;j++){

                if(i < 5 && j <  10){
                    System.out.print("*");
                    continue;
                }

                System.out.print("=");


            }
            System.out.println();
        }
    }
}
