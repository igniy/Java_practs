package mirea.lab2;

public class Legs {
    private int x;
    private int xSpeed;
    public Legs(int x,int xSpeed){
        this.x=x;
        this.xSpeed=xSpeed;
    }
    public void moveForward(){x+=xSpeed;};
    public void moveBackward(){x-=xSpeed;}

    @Override
    public String toString() {
        return "Legs" + " x: " + x + ", xSpeed: " + xSpeed;
    }
}
