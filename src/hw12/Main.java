package hw12;

public class Main {
    public static void main(String[] args) {
        Book lolita = new Book("Набоков В.В.", "Лолита", 1955);
        Author nabokov = new Author("Владимир","Набоков");
        System.out.println("Автор: " + lolita.getAuthor());
        System.out.println("Название: " + lolita.getTitle() + " ");
        System.out.println("Год публикации: " + lolita.getYear());
        System.out.println("Имя Фамилия автора: " + nabokov.getName() +" "+ nabokov.getSurname());
        lolita.setYear(1960);
        System.out.println("Год публикации на русском: " + lolita.getYear());
        System.out.println();
        Book idiot = new Book("Достоевский Ф.М.", "Идиот",1867);
        Author dostoevsky = new Author("Федор Михайлович","Достоевский");
        System.out.println("Автор: " + idiot.getAuthor());
        System.out.println("Название: " + idiot.getTitle() + " ");
        System.out.println("Год публикации: " + idiot.getYear());
        System.out.println("Имя Фамилия автора: " + dostoevsky.getName() +" "+ dostoevsky.getSurname());
        idiot.setYear(1869);
        System.out.println("Год публикации : " + idiot.getYear());
    }
}