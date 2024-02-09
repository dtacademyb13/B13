package day24;

public class LibaryBookTracker {


    /*
    Library Book Tracker
Objective:
Develop a Java program that allows a library to manage its books. Users can add books to the library, lend them out, return them, and view the total number of books and how many are currently lent out.
Class Requirements:
Instance Variables:
title: a String to store the book's title.
isLentOut: a boolean to track whether the book is currently lent out.
Static Variables:
totalBooks: an integer to track the total number of books in the library.
booksLentOut: an integer to track the number of books currently lent out.
Constructors:
Book(String title): Initializes a new book with the given title. Increments totalBooks.
Instance Methods:
lendOut(): Marks the book as lent out, and increments booksLentOut.
returnBook(): Marks the book as not lent out, and decrements booksLentOut.
Static Methods:
getTotalBooks(): Returns the total number of books in the library.
getBooksLentOut(): Returns the number of books currently lent out.
LibraryManager Main Method Logic:
Initialize a Scanner object to read input from the console.
Create a loop to allow the user to add books, lend out books, return books, view total books, view lent out books, or exit.
Use switch-case or if-else statements to handle user commands:
Add a book: Create a Book object and add it to the collection.
Lend out a book: Mark a book as lent out.
Return a book: Mark a book as not lent out.
View total books: Display the result of Book.getTotalBooks().
View lent out books: Display the result of Book.getBooksLentOut().
     */


    public static void main(String[] args) {

        Book book1 = new Book("The Lord of the Rings");
        Book book2 = new Book("War and Peace");
        Book book3 = new Book("Blue Ribbon");
        Book book4 = new Book("The hound of the Baskerville");


        System.out.println("The total books in the library: " + Book.getTotalBooks() );

        book1.lendOut();
        book2.lendOut();

        System.out.println("The total books in the library that are lent out: " + Book.getBooksLentOut() );

        book1.lendOut();
        book2.returnBook();

        System.out.println("The total books in the library that are lent out: " + Book.getBooksLentOut() );

        book1.setTitle("Ring of the Lords");

        System.out.println("The status of the books in the library:" );
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println(book4.getInfo());




    }
}
