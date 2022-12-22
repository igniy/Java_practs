package mirea.newpract1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n= sc.nextInt();
        System.out.println("Введите n чисел");
        int mas[] = new int[n];
        for (int i=0;i<n;i++){
            mas[i]=sc.nextInt();
        }
        int s=0;
        int i=0;
        do {s+=mas[i]; i++;}
        while (i<n);
        i=0;
        int maxi=mas[0],mini=mas[0];
        while (i<n){
            if (mas[i]>maxi) maxi=mas[i];
            if (mas[i]<mini) mini=mas[i];
            i++;
        }
        System.out.println("Сумма элементов массива: "+s+"\nМаксимальный элемент: "+maxi+"\nМинимальный элемент: "+mini);
    }
}
