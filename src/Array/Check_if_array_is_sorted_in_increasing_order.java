package Array;
import java.util.Scanner;
public class Check_if_array_is_sorted_in_increasing_order {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }

        if(sorted) System.out.println("Yes, the array is sorted in increasing order");
        else System.out.println("No, the array is not sorted in increasing order");
    }
}
