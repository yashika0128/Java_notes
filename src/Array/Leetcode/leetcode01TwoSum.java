package Array.Leetcode;
import java.util.Scanner;
public class leetcode01TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();

        int [] arr= new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target= sc.nextInt();
        int [] result= new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == target) {
                    result[0]=i;
                    result[1]= j;
                }
            }
        }
        System.out.println(result[0]+" "+result[1]);
    }
}
