package day28;

public class SubClass extends SomeClass {


    private String property1;
    private String property2;

    public SubClass(String author, String publicationDate, String title, String property1, String property2) {
        super(author, publicationDate, title);
        this.property1 = property1;
        this.property2 = property2;
    }
}
