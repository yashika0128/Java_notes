package Array;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the number: ");
        int x= sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            if(x==arr[i]){
                System.out.print(i+" ");
            }else{
                break;
            }
        }
        System.out.println("Element does not exist in this array");

    }
}
