
/*
这个题目似乎可以节省一些空间，比如可以使用滚动数组，或者使用三个数字滚动
*/


public class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2 || n==3){
            return n;
        }
        int dp[] = new int[n];
        dp[0] = 1; dp[1] = 2;
        for( int i = 2; i < n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
        
    }
}