package day28;

public class SomeClass {

    private String author;
    private String publicationDate;
    private String title;

    public SomeClass(String author, String publicationDate, String title) {
        this.author = author;
        this.publicationDate = publicationDate;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getItemDetails() {
        return "SomeClass{" +
                "author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
