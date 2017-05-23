/*
leetcode problem 48
题目对于搞过数字图像处理的我来说还是比较简单，但是这样的话复杂度就是2n^2，能不能继续优化一下呢
*/

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp[][] = new int[n][n];
        for( int i = 0; i < n; i++){
            for( int j = 0;j < n;j++){
                temp[j][n-i-1] = matrix[i][j];
            }
        }
        for( int i = 0; i < n; i++){
            for( int j = 0;j < n;j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}