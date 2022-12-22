package mirea.practic5;

import java.util.Scanner;

public class Ex2 {
    public static void outputOdd() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                outputOdd();
            } else {
                outputOdd();
            }
        }
    }
    public static void main(String[] args) {
        outputOdd();
    }
}
