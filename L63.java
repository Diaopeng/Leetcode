/*
仍然是同样的状态转移方程，但是题目最主要解决的问题就是障碍的影响
*/
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0)
        return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] result = new int[m][n];
        if(obstacleGrid[0][0] == 1) result[0][0] = 0;
        else result[0][0] =1;
        for(int i = 1;i < n;i++){
            if(obstacleGrid[0][i] == 1 ||  result[0][i-1] == 0) result[0][i] = 0;
            else result [0][i] = 1;
        }
        for(int i = 1;i < m;i++){
            if(obstacleGrid[i][0] == 1 ||  result[i-1][0] == 0) result[i][0] = 0;
            else result [i][0] = 1;
        }
        
        for(int i = 1; i < m ;i++){
            for( int j = 1; j < n;j++){
                 if(obstacleGrid[i][j] == 1)  result[i][j] = 0;
                 else result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        return result[m-1][n-1];
    }
}
//这是得票最高的答案的解法，这种解法确实更加的巧妙，空间复杂度降低为O(n),使用加法的方式巧妙的解决了障碍的问题
//在最开始的一行，和最开始的一列，一旦出现障碍，则整个的行或者列的后面全部为0
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) 
           return 0;
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for(int []row : obstacleGrid){
            for(int i = 0; i < width; i++){
                if(row[i] == 1) 
                   dp[i] = 0;
                else if(i > 0)
                   dp[i] += dp[i-1];
            }
        }
        return dp[width-1];
    }
}