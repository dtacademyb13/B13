package day21;

public class Book {

    // This class represents a blueprint for a  book in real life


   // Each class contains properties that are represented by instance variables:

    // INSTANCE -> OBJECT

    String title;
    String author;
    String publisher;
    int pageCount;

    boolean isBorrowed;

  // the location of the instance variables do not matter as long as they are declared in the body of the class

    // Each class contains behaviors that are represented by instance methods

    public void checkout(){
        if(!isBorrowed){
            isBorrowed = true; // update the status of the book to already borrowed
            System.out.println("The book " + title + " is now borrowed");
        }else{
            System.out.println("The book " + title + " is already borrowed.");
        }
    }

    public void returnBook(){
        System.out.println("Return the book...");
    }


    public void printBookDetails(){
        System.out.println("The DETAILS:");
        System.out.println("The author: " + author);
        System.out.println("The title: " + title);
        System.out.println("The publisher: " + publisher);
        System.out.println("The page count: " + pageCount);
        System.out.println("Is it available?: " + !isBorrowed);
    }




}
