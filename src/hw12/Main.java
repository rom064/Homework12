package hw12;

public class Main {
    public static void main(String[] args) {
        Author nabokov = new Author("Владимир","Набоков");
        Book lolita = new Book(nabokov, "Лолита", 1955);
        System.out.println("Автор: " + nabokov);
        System.out.println("Название: " + lolita.getTitle() + " ");
        System.out.println("Год публикации: " + lolita.getYear());
        lolita.setYear(1960);
        System.out.println("Год публикации на русском: " + lolita.getYear());
        System.out.println();
        Author dostoevsky = new Author("Федор Михайлович","Достоевский");
        Book idiot = new Book(dostoevsky, "Идиот",1867);
        System.out.println("Автор: " + dostoevsky);
        System.out.println("Название: " + idiot.getTitle() + " ");
        System.out.println("Год публикации: " + idiot.getYear());
        idiot.setYear(1869);
        System.out.println("Год публикации : " + idiot.getYear());
    }
}