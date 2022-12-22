package mirea.practic2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.5, 50);
        System.out.println(b1);
        b1.move(42.323, 4.9);
        System.out.println(b1);
    }
}
