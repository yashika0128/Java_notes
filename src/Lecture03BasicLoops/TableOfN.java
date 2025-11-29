package Lecture03BasicLoops;
import java.util.*;
public class TableOfN {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int table = 1;
        for(int i=1; i<=10; i++){
            table = n*i;
            System.out.println(table);
        }

    }
}
