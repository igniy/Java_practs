package mirea.lab2;

public class Head{
    private String eyesColor;
    private String hairsColor;
    private String view;
    public Head(String eyesColor, String hairsColor,String view){
        this.eyesColor=eyesColor;
        this.hairsColor=hairsColor;
        this.view=view;
    }
    public String getEyesColor(){return eyesColor;}
    public String getHairsColor(){return hairsColor;}
    public void turnRight(){view="right";}
    public void turnLeft(){view="left";}
    @Override
    public String toString() {
        return "Head, " + " eyesColor: " + eyesColor + ", hairsColor: " + hairsColor  + ", view: "+view+'.';
    }
}
