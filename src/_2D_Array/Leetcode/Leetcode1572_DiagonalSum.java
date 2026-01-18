package _2D_Array.Leetcode;

public class Leetcode1572_DiagonalSum {
    public static void main(String[] args) {

        class Solution {
            public int diagonalSum(int[][] mat) {

                // 1st:
                int sum= 0;
                // for(int i=0;i<mat.length;i++){
                //     for(int j=0;j<mat[0].length;j++){
                //         if(i==j)sum+= mat[i][j];
                //     }
                // }
                // for(int i=0;i<mat.length;i++){   // i= 0,1,2,3,......,<mat.length
                //     for(int j= mat[0].length-1;j>=0;j--){
                //         if(i !=j && i+j == mat.length-1) sum +=mat[i][j];
                //     }
                // }

                //2nd:

                // for(int i=0;i <mat.length;i++){
                //     sum += mat[i][i];
                //     if(i != mat.length-i-1) sum+= mat[i][mat.length-i-1];
                // }

                //3rd:
                int n= mat.length;
                for(int i=0;i<n;i++){
                    sum += mat[i][i];
                    sum += mat[i][n-1-i];
                }
                if(n%2 != 0) sum -= mat[n/2][n/2];

                return sum;
            }
        }
    }
}
