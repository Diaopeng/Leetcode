/*
Author: Oliver Gao
time complexity : O(m+n)
Statuse: AC
*/

/*
本次的代码的提交经历了多次的数组越界错误，经过别人提醒，我觉得应该测试的数据中有以下的数据
matrix == null
matrix == []空数组
所以应该在之前判断好数组matrix是否为空，然后在进行计算
*/


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
        return false;
        int n = matrix.length,m = matrix[0].length;
        int row = 0, column = m-1;
        while(row<n&&column>=0 ){
        if(matrix[row][column]==target){
                    return true;
                }
                else if(matrix[row][column]<target){
                    ++row;
                }
                else{
                    --column;
                }
            }
            return false;
    }
}