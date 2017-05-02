
/*
这是一个数塔的问题，以下是O(n^2)的解法，这种解法是从下面往上面计算
dp的方法；
当然我们也可以使用记忆化搜索的额方法，并且可以尝试降低一下空间的复杂度

*/

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int i = 0;i < n;i++){
            dp[n-1][i] = triangle.get(n-1).get(i);
        }
        for(int i = n-2;i >= 0;i-- ){
            for(int j = 0;j <= i;j++){
                dp[i][j] = Math.min(dp[i+1][j+1],dp[i+1][j])+triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}