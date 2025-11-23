package Array;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array: ");
        int n= sc.nextInt();

        int [] arr= new int [n];
        System.out.println("Input the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        // (1).  only works for +ve numbers
//        int max= 0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

        // (2). Works for -ve and +ve both
        int max= arr[0];
        // (3). int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
