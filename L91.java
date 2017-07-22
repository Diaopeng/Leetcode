public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s == null || n == 0 )
            return 0;
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0'? 0:1;
        for(int i = 2;i <= n;i++){
            int digit = Integer.valueOf(s.substring(i-1,i));
            int digits = Integer.valueOf(s.substring(i-2,i));
            if(digit >= 1 && digit <= 9)
                dp[i] += dp[i-1];
            if(digits >= 10 && digits <= 26)
                dp[i] += dp[i-2];
        }
        return dp[n];
    }
}
