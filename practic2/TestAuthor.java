package mirea.practic2;

public class TestAuthor {
    public  static void main(String [] args){
        Author a = new Author("Iosif Brodsky","i.brodsky@gmail.com",'m');
        System.out.println(a);
        a.setEmail("brodsky.i@edu.mirea.ru");
        System.out.println(a);
    }
}
