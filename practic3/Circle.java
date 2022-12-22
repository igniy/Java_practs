package mirea.practic3;
import java.lang.Math.*;
public class Circle extends Shape{
    protected double radius;
    public Circle(){}
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){return radius;}
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
