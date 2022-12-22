package mirea.practic1;

public class Book {
    private String name;
    private int nop; //number of pages
    public Book(String name, int nop){
        this.name = name;
        this.nop = nop;
    }
    public Book(String name){
        this.name = name;
        nop = 0;
    }
    public Book(){
        name = "book";
        nop = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNop(int nop){
        this.nop = nop;
    }
    public String getName(){return name;}
    public int getNop(){return nop;}
    public String toString(){
        return this.name+", nop "+this.nop;
    }
    public void getTimeOfReading(){
        System.out.println("The "+ name+" is read for "+(nop*3)/60+" hours");
    }
}
