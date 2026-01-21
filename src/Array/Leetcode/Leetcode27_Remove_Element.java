package Array.Leetcode;

public class Leetcode27_Remove_Element {
    public static void main(String[] args) {
        class Solution {
            public int removeElement(int[] nums, int val) {
                // int count =0;
                // for(int i=0;i<n;i++){
                //     if(nums[i] == val) count++;
                // }

                int i=0;
                int j=0;
                while(i<nums.length){
                    if(nums[i] != val){
                        nums[j]=nums[i];
                        i++;
                        j++;
                    }else{
                        i++;
                    }
                }
                return j;
            }
        }
    }
}
