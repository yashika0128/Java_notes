package Array;
import java.util.Scanner;
public class secondMaxElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n= sc.nextInt();
        int [] arr= new int[n];

        // Input all the elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        // Finding 1st largest number
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) max= arr[i];
        }
        System.out.println("The Highest numbers among all is: "+max);

        // Finding 2nd largest number
        //Arrays.sort(arr);
        int secMax=Integer.MIN_VALUE;
//        int i=0;
//        while(arr[i] != max){
//            if(arr[i] >secMax) secMax = arr[i];
//            i++;
//        }
//        System.out.println("The Second highest number is: "+secMax);

        for (int i = 0; i < n; i++) {
            if(arr[i]>secMax && arr[i] != max) secMax=arr[i];
        }
        System.out.println("The Second highest number is: "+secMax);
    }
}
