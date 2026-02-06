package Recursion;

import java.util.Scanner;

public class Fibonaccia_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1) return n;
        int x= fibo(n-1);
        int y = fibo(n-2);
        return x+y;
    }
}
