
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
/*
一下是空间复杂度为O(n)的解法，在多次计算中有时候我们不需要开很大的控件，只要空间足够计算就可以使用。
最开始想到的是用两个长度为n的数组
*/

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp1[] = new int[n];
        for(int i = 0;i < n;i++){
            dp1[i] = triangle.get(n-1).get(i);
        }
        for(int i = n-2;i >= 0;i-- ){
            for(int j = 0;j <= i;j++){
                dp1[j] = Math.min(dp1[j+1],dp1[j])+triangle.get(i).get(j);
            }
        }
        return dp1[0];
    }
}