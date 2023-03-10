package mirea.practic3;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "Point, x: "+x+", y: "+y;
    }

    @Override
    public void moveUP() {y+=ySpeed;}
    public void moveDown() {y-=ySpeed;}
    public void moveLeft() {x-=xSpeed;}
    public void moveRight() {x+=xSpeed;}
}
