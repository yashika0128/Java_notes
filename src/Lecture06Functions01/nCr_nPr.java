package Lecture06Functions01;
import java.util.Scanner;
public class nCr_nPr {
    public static int nCr(int n, int r) {
        return factorial(n)/ (factorial(r)*(factorial(n-r)));
    }

    public static int factorial(int a) {
        int m=1;
        for(int i=1;i<=a;i++){
            m *=i;
        }
        return m;
    }

    public static int nPr(int n, int r) {
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:" );
        int n= sc.nextInt();
        System.out.println("Enter r: ");
        int r=sc.nextInt();
        System.out.println("Value of nCr for n = "+ n+ " and r = "+r+" is equal to "+nCr(n,r)+".");
        System.out.println("Value of nPr for n = "+ n+ " and r = "+r+" is equal to "+nPr(n,r)+".");
    }
}
