/*
典型的0-1背包问题，0-1背包中我们需要求解的是最大值，这个问题中我们求解的是如何达到我们设定的值即sum/2
这种方法的时间复杂度是O(m*n),空间复杂度也是这样，我们可以降低我们的空间复杂度。
*/

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 == 1)
            return false;
        sum /= 2;
        boolean[][] dp = new boolean[nums.length + 1][sum + 1];
        for(int i = 0;i <= nums.length;i++){
            dp[i][0] = true;
        }
        for(int i = 1;i <= nums.length;i++){
            for(int j = 1;j <= sum;j++){
                dp[i][j] = (j>=nums[i-1])? (dp[i-1][j]||dp[i-1][j-nums[i-1]]):dp[i-1][j];
            }
        }
        return dp[nums.length][sum];
    }
}
//在本文题优化过程中我们不能使用j = 1:sum，因为我们的dp数组的值需要保证dp[j - nums[i]]没有被改变，但是如果我们j = 1:sum ，那么会导致可能dp[j - nums[i]]可能已经被改变了
public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 == 1)
            return false;
        sum /= 2;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for(int i = 0;i < nums.length;i++){
            for(int j = sum;j > 0;j--){
                if(j>=nums[i])
                    dp[j]= dp[j]||dp[j-nums[i]];
            }
        }
        return dp[sum];
    }
}
