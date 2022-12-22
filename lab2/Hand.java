package mirea.lab2;

public class Hand{
    private int y;
    private int ySpeed;
    public Hand(int y,int ySpeed){
        this.y=y;
        this.ySpeed=ySpeed;
    }
    public void raise(){y+=ySpeed;}
    public void lower(){y-=ySpeed;}

    @Override
    public String toString() {
        return "Hand" + " y: " + y + ", ySpeed: " + ySpeed;
    }
}
