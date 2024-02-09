package day40.fileOperations;

import java.io.File;
import java.io.IOException;

public class FileDemo {


    public static void main(String[] args) throws IOException, InterruptedException {


        File file = new File("C:\\Users\\Nuclues\\Desktop\\Demo\\another.txt");
        File file2 = new File("C:\\Users\\Nuclues\\IdeaProjects\\B13\\src\\day40\\fileOperations\\myFile.txt");
        System.out.println(file2.exists());
        System.out.println(file.exists());

        file.createNewFile();

        Thread.sleep(2000);

//        file.renameTo(new File("C:\\Users\\Nuclues\\Desktop\\Demo\\renamed.docx"));

        file.delete();






    }
}
