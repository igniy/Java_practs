package mirea.lab2;

public class Human {
    private int height;
    private int weight;
    private int age;
    private String name;
    public Human(){}
    public Human(int height, int weight, int age, String name){
        this.height=height;
        this.weight=weight;
        this.age=age;
        this.name=name;
    }
    public int getAge() {return age;}
    public int getHeight() {return height;}
    public int getWeight(){return weight;}
    public String getName(){return name;}

    @Override
    public String toString() {
        return "Human, " + "height: " + height + ", weight: " + weight + ", age: " + age + ", name: " + name +'.';
    }

}