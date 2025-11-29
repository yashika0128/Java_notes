package Lecture06Functions01;
import java.util.Scanner;
public class SwapNumbers {
    public static void Swap(int a, int b) {
        int temp= a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        Swap(a,b);
    }
}
