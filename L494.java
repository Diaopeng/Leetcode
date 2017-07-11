
/*
这个题目中，我们使用一种计算的方法，将问题规划成为一个在nums中找出多少种方法可以使得数组中的某些数加起来的和为 (sum + S) / 2
*/

public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if(sum < S || (sum + S) %2 == 1)
            return 0;
        sum = (sum + S)/2;
        int [] dp = new int[sum + 1];
        dp[0] = 1;
        for(int num : nums){
            for(int j = sum;j >= 0;j-- ){
                if(j - num >= 0)
                    dp[j] += dp[j-num];
            }
        }
        return dp[sum];
        
            
    }
}
