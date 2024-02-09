package day40.fileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderDEmo {


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/day40/fileOperations/myFile.txt"));

//        String firstLine = bufferedReader.readLine();
//
//        System.out.println(firstLine);

         List<String> content = new ArrayList<>();
//        String line;
//         while ( (line = bufferedReader.readLine()) != null ) {
//             content.add(line);
//         }

        bufferedReader.lines().forEach(s -> content.add(s));

        System.out.println(content);

        bufferedReader.close();




    }
}
