package mirea.practic1;

public class Cat {
    private String name;
    private int weight;

    public Cat(String n, int w){
        name=n;
        weight = w;
    }
    public Cat(String n){
        name=n;
        weight = 5;
    }
    public Cat(){
        name="Pup";
        weight = 5;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public String toString(){
        return this.name+", weight "+this.weight;
    }
    public void getLifestyle(){
        if (weight>5)
            System.out.println(name+" is very lazy, so it weighs "+weight+" kilograms.");
        else
            System.out.println(name+" is very active, so it weighs "+weight+" kilograms.");
    }
}
