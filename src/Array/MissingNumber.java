package Array;
public class MissingNumber {

    // Leetcode 268 (Missing Number) solution
    class Solution {
        public int missingNumber(int[] nums) {
            int sum1=0;
            int sum2=0;
            for(int i=0;i<nums.length;i++){
                sum1 += nums[i];
            }
            for(int i=0;i<=nums.length;i++){
                sum2 += i;
            }
            return sum2-sum1;
        }
    }

    // GFG solution
    class Solution2 {
        int missingNum(int arr[]) {
            int n= arr.length;

            int sum1 = 0;
            int sum2 = 0;
            for(int i=0; i<n; i++){
                sum1 += arr[i];
            }
            for(int i=0; i<=n+1; i++){
                sum2 +=i;
            }

            return sum2-sum1;
        }
    }


}
