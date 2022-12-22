package mirea.lab3;

public class DogTest {
    public static void main(String [] args){
        Shepherd d1 = new Shepherd("Jack",7,15);
        System.out.println(d1);
        d1.learnTheCommand("voice");
        d1.toBark("Voof");
        System.out.println(d1);

        Husky d2 = new Husky("Kai",3,10);
        System.out.println(d2);
        d2.learnTheCommand("sit");
        d2.toBark("wooooo");
        System.out.println(d2);
    }
}
