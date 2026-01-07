package Array;
import java.util.Scanner;
public class Find_index_of_Maximum_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }
        }
        System.out.println("Index of the maximum number is: "+ max_index);
    }
}
