package mirea.newpract3;
import java.util.ArrayList;
import java.util.Random;
public class Ex3 {
    public static void main(String[] args){
        ArrayList<Integer> mas = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            mas.add(new Random().nextInt(10,100));
        }
        System.out.println("Array: " + mas.toString());
        System.out.println(checkArray(mas));
    }

    public static boolean checkArray(ArrayList<Integer> tmp){
        for(int i = 1; i < tmp.size(); i++){
            if (tmp.get(i) <= tmp.get(i-1)) return false;
        }
        return true;
    }
}
