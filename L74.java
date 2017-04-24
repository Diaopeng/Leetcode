
/*
本题目需要注意的就两点，一个就是数组为空的判断，一个是binary search 不要写成死循环
*/


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m*n-1;
        while(left <= right ){
            int mid = (left + right)/2;
            if(matrix[mid/n][mid%n] == target){
                return true;
            }
            else if(matrix[mid/n][mid%n] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}