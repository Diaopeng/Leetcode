/*
状态转移方程为 dp[i] = dp[j] && dp[j] && wordDict.contains(s.substring(j,i)))
表示方法，我们使用dp[i] 来表示，0 - i之间的字符串是可以segmented into sequences of dictionary words
*/
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0;j < i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i)))
                    dp[i] = true;
            }
        }
        return dp[s.length()];
        
    }
}
