package day03;

//import another.Dog;
// syntax -> import packageName.ClassName

import java.util.ArrayList; // import of a specific class
import java.util.Scanner;


public class PackageDemo {

    public static void main(String[] args) {

        Student student  = new Student(); //Student is in the same package so no need to be imported
//        Dog dog  = new Dog(); //Dog is in another package so needs to be imported

        Scanner scanner = new Scanner(System.in);

        String str = "ds"; // Classes in java.lang like String,StringBuilder is automatically imported

//        StringBuilder stringBuilder = new StringBuilder();

        ArrayList arrayList = new ArrayList();
    }
}
