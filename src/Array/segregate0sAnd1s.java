package Array;

public class segregate0sAnd1s {
    public static void main(String[] args) {
        int [] arr= {0, 0, 0, 1, 0};
        // 1. 1st approach
//        int numOfZeros = 0;
//        int numOfOnes = 0;
//        for(int ele:arr){
//            if(ele == 0) numOfZeros ++;
//            else numOfOnes ++ ;
//        }
//
//        for(int j=0; j<numOfZeros; j++){
//            arr[j]= 0;
//        }
//        for(int j=numOfZeros; j<arr.length; j++){
//            arr[j] = 1;
//        }
//
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // 2. Second approach using 2-pointer
        int n= arr.length;
        int i=0;
        int j= n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) j--;
            else if (arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
    }
}
