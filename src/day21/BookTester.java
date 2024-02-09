package day21;

public class BookTester {


    public static void main(String[] args) {

        // Scanner scan =  new Scanner();
        // ClassName referenceName = new ClassName();

        int num ;
//        System.out.println(num);
        // local variables have to be initalized
        // intsance variables are automatically initailized to default values when an object is created
        Book book1 = new Book();
//        System.out.println(book1.title);
//        System.out.println(book1.pageCount);
//        System.out.println(book1.isElectronic);

        book1.checkout();
        book1.checkout();

        System.out.println(book1);

        for (int i = 0; i < 10000; i++) {
            Book book = new Book();
            System.out.println(book);
        }


        String str = "dcsv";



        Book book = new Book();

        book.checkout();

    }
}
