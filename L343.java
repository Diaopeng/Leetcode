
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

//答案的解法就是将n不断的分解，因为n%2 == 0  n >= 4时候是可以分解的,n是奇数时候，n >= 5分解是合算的，所以选择2或者3进行分解，

public class Solution {
    public int integerBreak(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        int result = 1;
        while(n > 4){
            result *= 3;
            n -= 3;
        }
        result = result * n;
        return result;
        
    }
}
