package mirea.lab1;

public class Test {
    public static void fr() {
        int summ = 0;
        int[] b = {1, 2, 3, 4, 5};
        int l = b.length;
        for (int i = 0; i < l; i++) {
            summ += b[i];
        }
        System.out.println("For: "+summ);
    }
    public static void wl(){
        int summ=0;
        int[] b = {1, 2, 3, 4, 5};
        int l = b.length;
        int i=0;
        while (i<l){
            summ+=b[i];
            i++;
        }
        System.out.println("While: "+summ);
    }
    public static void dwl() {
        int summ = 0;
        int[] b = {1, 2, 3, 4, 5};
        int l = b.length;
        int i = 0;
        do {
            summ += b[i];
            i++;
        } while (i < l);
        System.out.println("Do While: " + summ);
    }
    public static void main(String[] args){
        fr();
        wl();
        dwl();
    }
}