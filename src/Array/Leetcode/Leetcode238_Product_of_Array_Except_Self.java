package Array.Leetcode;

public class Leetcode238_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        class Solution {
            public int[] productExceptSelf(int[] nums) {
                // int left =1;
                // int [] ans = new int[nums.length];
                // for(int i=0;i<nums.length;i++){
                //     int right=1;
                //     for(int j=nums.length-1; j>i;j--){
                //         right *= nums[j];
                //     }
                //     ans[i] = left*right;
                //     left *= nums[i];
                // }

                int [] arr_right= new int[nums.length];
                int right=1;
                for(int i=nums.length-1;i>=0;i--){
                    arr_right[i]= right;
                    right *= nums[i];
                }

                int [] ans= new int[nums.length];
                int left= 1;
                for(int i=0;i<nums.length;i++){
                    ans[i] = left*arr_right[i];
                    left *= nums[i];
                }
                return ans;
            }
        }
    }
}
