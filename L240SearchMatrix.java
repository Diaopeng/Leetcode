
/*
   本方法使用外层遍历加上内层二分查找的方法，复杂度为O(nlog(n)
   status: TLE
*/

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        for(int i = 0; i<matrix.length; ++i){
            int left = 0, right = m-1;
            int mid;
            while(left < right - 1){
                mid = left + (right - left)/2;
                if(matrix[i][mid]==target){
                    return true;
                }
                else if(matrix[i][mid]>target){
                    mid = right;
                }
                else{
                    mid = left;
                }
            }
        }
        return false;
    }
}