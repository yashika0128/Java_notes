package Recursion;

import java.util.Scanner;

public class Find_index_of_k_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int num: arr){
            num = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(f(arr,0,k));
    }
    public static int f(int[]arr,int idx, int k){
        if(idx == arr.length) return -1;
        if(arr[idx]==k)return k;
        return f(arr,idx+1,k);
    }
}
