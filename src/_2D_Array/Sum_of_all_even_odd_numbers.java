package _2D_Array;
import java.util.Scanner;
public class Sum_of_all_even_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();

        int [][] arr = new int[n1][n2];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int odd = 0;
        int even = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr[i][j]%2 ==0) even += arr[i][j];
                else odd+= arr[i][j];
            }
        }

        System.out.println("Sum of all even numbers = "+even);
        System.out.println("Sum of all odd numbers = "+ odd);
    }
}

