package mirea.newpract3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n = -1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (n < 0){
            System.out.println("Enter array's size: ");
            n = sc.nextInt();
        }

        int[] tmpArray = new int[n];

        for (int  i = 0; i < n; i++){
            tmpArray[i] = (rand).nextInt(n+1);
            if (tmpArray[i] % 2 == 0) count++;
        }
        System.out.println("Array: " + Arrays.toString(tmpArray));

        if (count == 0) return;

        int[] tmpArraySub = new int[count];
        count = 0;
        for(int i = 0; i < n; i++)
            if (tmpArray[i] % 2 == 0)
                tmpArraySub[count++] = tmpArray[i];

        System.out.println("Second array: " + Arrays.toString(tmpArraySub));
    }

}
