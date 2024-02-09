package day15;

public class PrintingShapes {

    public static void main(String[] args) {

        int num = 20;
        for (int i = 1; i <= num; i++) {

            for (int j = num-1; j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("%");
            }
            System.out.println();
            num--;
        }



    }
}
