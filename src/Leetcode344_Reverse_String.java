public class Leetcode344_Reverse_String {
    public static void main(String[] args) {
        class Solution {
            public void reverseString(char[] s) {
                // int i=0;
                // int j= s.length-1;
                // while(i<j){
                //     char temp = s[i];
                //     s[i]= s[j];
                //     s[j]= temp;
                //     i++;
                //     j--;
                // }

                for (int i = 0, j = s.length - 1; i < j; i++, j--) {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
                return;
            }
        }
    }
}
