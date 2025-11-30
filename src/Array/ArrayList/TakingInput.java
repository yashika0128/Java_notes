package Array.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> arr= new ArrayList<>();

        System.out.println("Enter the 5 elements");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter "+ (i+1) +"st element: ");
            arr.add(sc.nextInt());
        }
        System.out.println("Final array: "+arr);
    }
}
