package mirea.practic1;

public class Ball {
    private String sport;
    private int size;

    public Ball(String sport, int size){
        this.sport = sport;
        this.size = size;
    }
    public Ball(String sport){
        this.sport = sport;
        size = 0;
    }
    public Ball(){
        sport = "unknown";
        size = 0;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setSport(String sport){
        this.sport = sport;
    }
    public int getSize(){
        return size;
    }
    public String getSport() { return sport; }
    public String toString(){
        return  this.sport + ", size "+this.size;
    }
    public void getPriceOfBall(){
        System.out.println("A "+ sport+" costs " + size*1000 +" rubles.");
    }
}
