package mirea.practic5;

import java.util.Scanner;

public class Ex1 {
    public static int countOne(int x, int count){
        Scanner sc = new Scanner(System.in);
        int x1,x2;
        x1=x;
        x2= sc.nextInt();
        if (x2==1) count+=1;
        if (x1==0 && x2==0) return count;
        else {x1=x2; return countOne(x1,count);}
    }
    public static void main(String [] args){
        int count1=0;
        Scanner sc = new Scanner(System.in);
        int x1;
        x1 = sc.nextInt();
        if (x1==1) count1+=1;
        System.out.println(countOne(x1,count1));
    }
}
