package Recursion;
import java.util.Scanner;
public class Factorial_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get it's factorial: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+fact(n));
    }
    public static int fact(int n){
        // Base Case
        if(n==0) return 1;

        //Recursive Call
        int x = fact(n-1);

        // small calculation
        return n*x;
    }
}
