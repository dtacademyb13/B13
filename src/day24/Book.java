package day24;

public class Book {

    private String title;
    private boolean isLentOut;

    private static int totalBooks;
    private static int booksLentOut;

    public Book(String title) {
        this.title = title;
        totalBooks++;
    }


    public void lendOut(){
        if(!isLentOut){
            isLentOut = true;
            booksLentOut++;
        }else{
            System.out.println("It is already lent out");
        }

    }

    public void returnBook(){
        if(isLentOut){
            isLentOut = false;
            booksLentOut--;
        }else{
            System.out.println("It is already returned");
        }

    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    public static int getBooksLentOut(){
        return booksLentOut;
    }

    public boolean isLentOut() {
        return isLentOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getInfo() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isLentOut=" + isLentOut +
                '}';
    }

    /*
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
     */
}
