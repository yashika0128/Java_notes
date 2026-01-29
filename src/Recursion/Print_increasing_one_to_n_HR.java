package Recursion;

import java.util.Scanner;

public class Print_increasing_one_to_n_HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        PI(n);
    }
    public static void PI(int n){
        if(n==0) return;
        PI(n-1);
        System.out.println(n);
    }
}
