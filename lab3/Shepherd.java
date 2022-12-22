package mirea.lab3;

public class Shepherd extends Dog{
    private String command;
    private String bark;
    protected String name;
    public Shepherd(){}
    public Shepherd(String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public void learnTheCommand(String command) {
        this.command=command;
    }

    @Override
    public void toBark(String bark) {
        this.bark=bark;
        System.out.println(name+": "+bark);
    }
    public String toString(){
        return "Shepherd " + name + ", age = "+age +", weight = "+weight+", command:"+ command+'.';
    }
}
