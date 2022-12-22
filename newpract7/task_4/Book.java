package mirea.newpract7.task_4;

public class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга:" + "\n\tНазвание: " + title + "\n\tАвтор:" + author;
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
