package mirea.practic3;

public class MovableCircle{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        center= new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle," + " radius = " + radius + ", center = " + center;
    }
    public void moveUP() {center.moveUP();}
    public void moveDown() {center.moveDown();}
    public void moveLeft() {center.moveLeft();}
    public void moveRight() {center.moveRight();}
}
