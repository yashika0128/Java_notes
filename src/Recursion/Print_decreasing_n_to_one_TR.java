package Recursion;

import java.util.Scanner;

public class Print_decreasing_n_to_one_TR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        PD(n);
    }
    public static void PD(int n){

        // Base Case
        if(n==0) return;

        // Small Calculation
        System.out.println(n);

        //Recursive Call
        PD(n-1);
    }
}
