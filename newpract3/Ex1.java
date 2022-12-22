package mirea.newpract3;
import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static Double[] createMass1(int n) {
        Double[] arr = new Double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }
    public static Double[] createMass2(int n) {
        Double[] arr = new Double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }

    public static void print(int n, Double arr[]) {
        for (int i = 0; i < n; i++) System.out.print((arr[i]) + " | ");
    }
    public static void doFirstMethod(){
        Double []a=createMass1(10);
        System.out.println("Исходный массив:");
        print(10,a);
        Arrays.sort(a);
        System.out.println("\nОтсортированный массив:");
        print(10,a);
    }
    public static void doSecondMethod(){
        Double []a=createMass2(10);
        System.out.println("Исходный массив:");
        print(10,a);
        Arrays.sort(a);
        System.out.println("\nОтсортированный массив:");
        print(10,a);
    }
    public static void main(String[] args) {
        System.out.println("Класс Random:");
        doFirstMethod();
        System.out.println("\nМетод random() класса Math:");
        doFirstMethod();
    }
}
