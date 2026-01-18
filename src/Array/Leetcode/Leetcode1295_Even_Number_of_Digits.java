package Array.Leetcode;

public class Leetcode1295_Even_Number_of_Digits {
    public static void main(String[] args) {
        class Solution {
            public int findNumbers(int[] nums) {
                int final_count = 0;
                // for(int i=0;i<nums.length;i++){
                //     int count=0;
                //     while(nums[i]!=0){
                //         int temp= nums[i]%10;
                //         nums[i] /=10;
                //         count++;
                //     }
                //     if(count %2 == 0)final_count++;
                // }

                for(int i=0; i<nums.length;i++){
                    int count=0;
                    int num= nums[i];
                    while(num!=0){
                        num /= 10;
                        count ++;
                    }
                    if(count %2 ==0) final_count ++;
                }
                return final_count;
            }
        }
    }
}
