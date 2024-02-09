package day40.fileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class NewFileIOClasses {


    public static void main(String[] args) throws IOException {


//        Path path = Path.of("src/day40/fileOperations/record.txt");

        // Read from a file

//        Files.readAllLines(path);
        List<String> content = Files.readAllLines(Path.of("src/day40/fileOperations/record.txt"));
        content.forEach(System.out::println);


        //

        Files.write(Path.of("src/day40/fileOperations/record2.txt"), List.of(getRandomPassword(4),getRandomPassword(5), getRandomPassword(10)));

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
