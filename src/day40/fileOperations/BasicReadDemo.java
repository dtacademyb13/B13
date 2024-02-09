package day40.fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicReadDemo {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(new File("src/day40/fileOperations/myFile.txt"));

        List<String> fileContents = new ArrayList<>();
       while(scanner.hasNext()){
           fileContents.add(scanner.nextLine());
       }

        System.out.println(fileContents);



    }
}
