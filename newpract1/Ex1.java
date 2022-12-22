package mirea.newpract1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n= sc.nextInt();
        System.out.println("Введите n чисел");
        int summ=0;
        float sred;
        int mas[] = new int[n];
        for (int i=0;i<n;i++){
            mas[i]=sc.nextInt();
            summ+=mas[i];
        }
        sred=(float)summ/n;
        System.out.println("Сумма элементов массива: "+summ+"\nСреднее арифметическое: "+sred);
    }
}