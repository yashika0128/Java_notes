package Array;
import java.util.Scanner;
public class oddEvenSumMultiply {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();

        int [] arr= new int [n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                arr[i] += 10;
            }else{
                arr[i] *= 2;
            }
            System.out.print(arr[i]+" ");
        }

    }

}
