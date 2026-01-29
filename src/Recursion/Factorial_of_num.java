package Recursion;

public class Factorial_of_num {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(5));
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
