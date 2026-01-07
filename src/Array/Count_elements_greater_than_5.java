package Array;
import java.util.Scanner;
public class Count_elements_greater_than_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();
        int [] arr = new int [n];
        int count = 0;
        System.out.println("Enter the elements- ");
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
            if(arr[i]>5) count ++;
        }

        System.out.println("No. of elements greater than 5 are "+ count);

    }
}
