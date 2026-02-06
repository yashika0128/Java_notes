package Sorting;

public class Selection {
    public static void main(String[] args) {
        int [] arr ={7,4,5,9,2,1};
        selectionSort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void selectionSort(int[]arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int mini=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[mini]) mini=j;
            }
            swap(arr,arr[i],arr[mini]);
        }
    }
    public static void swap(int[]arr,int mini,int i){
        int temp = arr[mini];
        arr[mini]= arr[i];
        arr[i]= temp;
    }
}
