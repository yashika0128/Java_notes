package Lecture02Conditional_Statements;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int symbol= sc.nextInt();

        /*
        if 1 -> +
        if 2 -> -
        if 3 -> *
        if 4 -> /
        if 5 -> %
         */

        switch (symbol){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Invalid division");
                }else{
                    System.out.println(a/b);
                }

                break;
            case 5:
                if (b==0){
                    System.out.println("Invalid division");
                }else{
                    System.out.println(a%b);
                }

                break;

            default:
                System.out.println("INVALID INPUT");
        }

    }

}
