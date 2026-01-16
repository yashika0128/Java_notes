package Array;

public class Leetcode162_Find_Peak_Element {
    public static void main(String[] args) {
        class Solution {
            public int findPeakElement(int[] nums) {

                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]>nums[i+1]) return i;
                }
                return nums.length-1;
            }
        }

    }
}
