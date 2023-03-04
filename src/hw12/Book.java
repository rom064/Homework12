package hw12;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(Author author,String title, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }


    public void setYear(int year) {
        this.year = year;


    }
}