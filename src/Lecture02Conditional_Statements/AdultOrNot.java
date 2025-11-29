package Lecture02Conditional_Statements;
import java.util.*;
public class AdultOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        if(age >= 18) {
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
    }
}
