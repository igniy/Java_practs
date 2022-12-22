package mirea.lab4;

public class Planet implements Nameable {
    public String name;
    public Planet(String name){this.name=name;}
    @Override
    public String getName() {
        return name;
    }
}
