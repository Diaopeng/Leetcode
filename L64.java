/*
简单地动态规划，
注意降低空间复杂度到O(1)的方法
*/
public class Solution {
    public int minPathSum(int[][] grid) {
        int width = grid[0].length;
        int[] dp = new int[width];
        dp[0] = grid[0][0];
        for(int i = 1; i < width; i++){
            dp[i] = dp[i-1] + grid[0][i];
        }
        for(int i = 1; i < grid.length; i++){
            dp[0] += grid[i][0];
            for(int j = 1; j < width;j++){
                dp[j] = Math.min(dp[j-1],dp[j]) + grid[i][j];
            }
        }
        return dp[width - 1];
    }
}