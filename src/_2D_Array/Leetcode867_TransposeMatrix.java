package _2D_Array;

public class Leetcode867_TransposeMatrix {
    public static void main(String[] args) {
        class Solution {
            public int[][] transpose(int[][] matrix) {
                int [][] transpose = new int [matrix[0].length][matrix.length];
                for(int i=0; i<matrix[0].length; i++){
                    for(int j=0; j<matrix.length;j++){
                        transpose[i][j]= matrix[j][i];
                    }
                }
                return transpose;
            }
        }
    }
}
