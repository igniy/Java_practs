package mirea.practic3;

public class MovableRectangle{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1,int x2,int y2, int xSpeed, int ySpeed){
        topLeft= new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight= new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    @Override
    public String toString() {
        return "Rectangle," + " topLeft = " + topLeft + ", bottomRight = " + bottomRight;
    }
    public boolean toSynchronizeSpeed(){
        return topLeft.xSpeed== bottomRight.xSpeed && topLeft.ySpeed==bottomRight.ySpeed;
    }
    public void moveUP(){
        topLeft.moveUP();
        bottomRight.moveUP();
    }
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
