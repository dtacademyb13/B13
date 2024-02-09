package day39.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionClasses {


    public static void main(String[] args) {

        // IOException
        // FileNotFoundException
        // SQLException
        // InterruptedException


        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\Nuclues\\Desktop\\First\\Welcome.java");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        try {
            fileInputStream.read();
        } catch (IOException e) {
            System.out.println("No Input");
        }


//        try {
//            DriverManager.getConnection("db url");
//        } catch (SQLException e) {
//
//        }


        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(i);
        }

    }
}
