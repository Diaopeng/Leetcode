
//仍然是动态规划

public class Solution {
    public int integerBreak(int n) {
        int dp[] = new int[58];
        dp[2] = 1;
        for(int i = 3; i <= n;i++){
            for(int j = 1; j < i; j++){
                int temp = Math.max(dp[j],j) * Math.max(dp[i-j],i-j);
                if(temp > dp[i])
                    dp[i] = temp;
            }
        }
        return dp[n];
        
    }
}
