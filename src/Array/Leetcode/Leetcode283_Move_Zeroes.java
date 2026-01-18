package Array.Leetcode;

public class Leetcode283_Move_Zeroes {
    public static void main(String[] args) {
        class Solution {
            public void moveZeroes(int[] nums) {
                int n= nums.length;
                // int i=0;
                // int j=0;

                // while(i<n){
                //     if(nums[i]==0){
                //         i++;
                //     }else{
                //         nums[j]= nums[i];
                //         i++;
                //         j++;
                //     }
                // }
                // for(int k=j; k<n; k++){
                //     nums[k]=0;
                // }

                int z= 0;
                for(int nz = 0; nz<n; nz++){
                    if(nums[nz] !=0){
                        int temp= nums[nz];
                        nums[nz]= nums[z];
                        nums[z]= temp;
                        z++;
                    }
                }
            }
        }
    }
}
