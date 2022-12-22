package mirea.practic5;
import java.util.Scanner;
public class Ex3 {
    public static void outputOddNumber() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n);
            int m = sc.nextInt();
            if (m > 0) {
                outputOddNumber();
            }
        }
    }
    public static void main(String[] args) {
        outputOddNumber();
    }
}