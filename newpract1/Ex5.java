package mirea.newpract1;

import java.util.Scanner;

public class Ex5 {
    public static int Fact(int n){
       int p=1;
       for(int i=1;i<=n;i++){
           p*=i;
       }
       return p;
    }
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(Fact(n));
    }
}
