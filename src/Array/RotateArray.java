package Array;
import java.util.Scanner;
public class RotateArray {
    public static void rotate(int []arr, int i, int j) {
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input of the length
        System.out.println("Enter the length of the desired array: ");
        int n= sc.nextInt();
        int [] arr = new int[n]; //Formation if an array

        //Input the elements of the array
        System.out.println("Enter the elements of the desired array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        //Input k, which is the no. of times we have to rotate the array
        System.out.println("Enter the value of k: ");
        int k= sc.nextInt();

        //printing the original array
        System.out.println("Original Array -> ");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //Logic
        k= k%n;
        rotate(arr, 0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        System.out.println("Array after "+k+" times rotation -> ");
        for(int ele:arr) System.out.print(ele + " ");

    }
}
