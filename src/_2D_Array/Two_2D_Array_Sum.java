package _2D_Array;
import java.util.Scanner;
public class Two_2D_Array_Sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] arr1= new int[n1][n2];
        int[][] arr2 = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr1[i][j] =sc.nextInt();
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr1[i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(arr1[i][j]+" ");
            }
        }
    }
}
