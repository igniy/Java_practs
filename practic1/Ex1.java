package mirea.practic1;

public class Ex1 {
    public static void main(String[] args){
        Cat c1 = new Cat("Alice",4);
        Cat c2 = new Cat("Max");
        Cat c3 = new Cat();
        c2.setWeight(7);
        c3.setName("Persik");
        c3.setWeight(5);
        System.out.println(c1);
        c1.getLifestyle();
        c2.getLifestyle();
        c3.getLifestyle();
    }
}
