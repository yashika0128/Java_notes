package Lecture02Conditional_Statements;
import java.util.*;
public class switchstatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int greet= sc.nextInt();

        switch(greet){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Input");
        }


    }
}
