package mirea.practic1;

public class Ex3 {
    public static void main(String[] args){
        Book b1 = new Book("Green book",608);
        Book b2 = new Book("Harry Potter");
        Book b3 = new Book();
        b2.setNop(2375);
        b3.setName("Cinderella");
        b3.setNop(401);
        System.out.println(b1);
        b1.getTimeOfReading();
        b2.getTimeOfReading();
        b3.getTimeOfReading();
    }
}
