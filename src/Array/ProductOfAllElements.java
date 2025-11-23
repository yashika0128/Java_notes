package Array;
import java.util.Scanner;
public class ProductOfAllElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int muilti = 1;
        for (int i = 0; i < n; i++) {
            muilti *= arr[i];
        }
        System.out.println("Sum of all the numbers of the array = "+muilti);
    }
}
