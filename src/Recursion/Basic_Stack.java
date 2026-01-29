package Recursion;

public class Basic_Stack {
    public static void main(String[] args) {
        System.out.println("gla");
        int a = 10;
        System.out.println(f1(a));
        System.out.println("Welcome");
    }
    public static int f1(int b){
        int a =20;
        System.out.println(a+b+f2());
        return f2();
    }
    public static int f2(){
        int a =10, b=100;
        System.out.println(a+b);
        return a+b;
    }
}
