package day20;

import java.util.Arrays;

public class TicTacToe {


    public static void main(String[] args) {



        char[][] tictac = new char[3][3];



        for (int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < tictac[i].length; j++) {
                tictac[i][j] = '.';
                System.out.print(tictac[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        //  Add x at the center

        tictac[1][1] = 'X';

        for (int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < tictac[i].length; j++) {
                System.out.print(tictac[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        tictac[0][2] = 'O';

        for (int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < tictac[i].length; j++) {
                System.out.print(tictac[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
