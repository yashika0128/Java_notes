package Array;
import java.util.*;
public class SumOfAllElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();
        int sum= 0;
        int [] arr= new int [n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
