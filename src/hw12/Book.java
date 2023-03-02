package hw12;

public class Book {
    private String title;
    private int year;
    private String author;

    public Book(String author,String title, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;

    }
}