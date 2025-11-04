package Array;
import java.util.*;
public class MarksLessThan35 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];

        System.out.println("Input the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Input the target value: ");
        int target= sc.nextInt();
        boolean found= false;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                System.out.println(target+ " is present at index no.: " +i);
                found =true;
                break;
            }
        }
        if(found == false) {   // if(!found)
            System.out.println(target + " does not exists in the array");
        }
    }
}