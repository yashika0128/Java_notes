package Array.ArrayList;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
public class PlusOne {
    public static void main(String[] args) {

        // LEETCODE 66 -> PLUS ONE
        class Solution1 {
            public int[] plusOne(int[] d) {
                ArrayList<Integer>arr=new ArrayList<>();
                int c=1;
                for(int i=d.length-1;i>=0;i--){
                    arr.add(0,(d[i]+c)%10);
                    c=(d[i]+c)/10;
                }
                if(c==1){
                    arr.add(0,1);
                }
                int[] ans=new int[arr.size()];
                for(int i=0;i<arr.size();i++){
                    ans[i]=arr.get(i);
                }
                return ans;
            }
        }


        // GFG Practise Set
        class Solution2 {
            // Function for adding one to the number represented by the array
            Vector<Integer> addOne(int[] arr) {
                Vector<Integer> ans= new Vector<>();
                int carry =1;
                int n= arr.length;
                for(int i=arr.length-1; i>=0; i--){
                    ans.add((arr[i]+carry)%10);
                    carry= (arr[i]+carry)/10;
                }
                if(carry == 1){
                    ans.add(1);
                }

                Collections.reverse(ans);
                return ans;
            }
        }
    }
}
