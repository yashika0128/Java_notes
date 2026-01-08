package Array;
import java.util.Scanner;
public class Second_third_maximum_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int n1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>n1) n1 = arr[i];
        }
        int n2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>n2 && arr[i]<n1) n2= arr[i];
        }
        int n3 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>n3 && arr[i]<n2) n3 = arr[i];
        }

        System.out.println("Second Larget Number: "+ n2);
        System.out.println("Third largest number: "+n3);
    }
}
