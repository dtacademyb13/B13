package day21;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {


        System.out.println("Welcome to the library Management!");


        Book book1 = new Book();
        // Initialize its instance variables
//        book1.author = "JR Tolkien";
//        book1.title = "The lord of the rings";
//        book1.publisher = "Random House";
//        book1.pageCount = 125;
//        book1.isBorrowed = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book info.");
        System.out.println("TITLE: ");
        book1.title = scanner.nextLine();
        System.out.println("AUTHOR: ");
        book1.author = scanner.nextLine();
        System.out.println("PUBLISHER: ");
        book1.publisher = scanner.nextLine();
        System.out.println("PAGE COUNT: ");
        book1.pageCount = scanner.nextInt();

        book1.isBorrowed = false;



        System.out.println("The Book has been added...");
        book1.printBookDetails();

        System.out.println("Do you want to borrow this book? (true/false) ");
        boolean response = scanner.nextBoolean();
        if(response){
            book1.checkout();
        }



//        System.out.println("----------------------------------");
//
//        Book book2 = new Book();
//
//        book2.author = "Arthur Conan Doyle";
//        book2.title = "Adventures of Sherlock Holmes";
//        book2.publisher = "Penguin";
//        book2.pageCount = 500;
//
//
//        System.out.println("Book 2 has been added.");
//        System.out.println("The DETAILS:");
//        System.out.println("The author: " + book2.author);
//        System.out.println("The title: " + book2.title);
//        System.out.println("The publisher: " + book2.publisher);
//        System.out.println("The page count: " + book2.pageCount);








    }
}
