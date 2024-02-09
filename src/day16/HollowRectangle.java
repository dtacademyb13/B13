package day16;

public class HollowRectangle {


    public static void main(String[] args) {





        for (int i = 1; i<= 13; i++){

            for(int j = 1; j<= 50;j++){

                 if(i == 1 || j == 1 || i == 13 || j == 50)
                    System.out.print("*");
                 else {
                     System.out.print(" ");
                 }


            }
            System.out.println();
        }
    }
}
