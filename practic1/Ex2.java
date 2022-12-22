package mirea.practic1;

public class Ex2 {
    public static void main(String[] args){
        Ball b1 = new Ball("basketball",7);
        Ball b2 = new Ball("soccer",5);
        Ball b3 = new Ball();
        b3.setSize(2);
        b3.setSport("baseball");
        b1.getPriceOfBall();
        b2.getPriceOfBall();
        b3.getPriceOfBall();
    }
}