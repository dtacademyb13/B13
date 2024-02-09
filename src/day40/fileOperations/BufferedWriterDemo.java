package day40.fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BufferedWriterDemo {


    public static void main(String[] args) throws IOException {


        BufferedWriter br =  new BufferedWriter(new FileWriter("src/day40/fileOperations/record.txt"));

        for (int i = 0; i < 100; i++) {
            br.write(getRandomPassword(40));
            br.newLine();
        }


        br.close();



    }


    public static String getRandomPassword(int length){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^";

        StringBuilder collect = new StringBuilder();
        for (int i = 0; i < length; i++) {
            collect.append(str.charAt(new Random().nextInt(str.length())));
        }

        return collect.toString();
    }
}
