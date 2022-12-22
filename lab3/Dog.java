package mirea.lab3;

public abstract class Dog {
    protected int age;
    protected int weight;
    public Dog() {}
    public Dog(int age, int weight){
        this.age=age;
        this.weight=weight;
    }


    abstract public void learnTheCommand(String command);
    abstract public void toBark(String bark);
}
