package mirea.lab4;

public class Dog implements Nameable{
    public String name;
    public Dog(String name){this.name=name;}
    @Override
    public String getName() {
        return name;
    }
}
