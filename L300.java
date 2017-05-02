/*
这道题目使用动态规划，dp[i]表示以i为结尾的数组的最长增长子序列。

*/


public class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int dp[] = new int[nums.length];
        if(nums == null || nums.length == 0) return ans;
        for(int i = 0;i < nums.length; i++){
            dp[i] = 1;
            for(int j = 0;j < i;j++){
                if(nums[j] < nums[i]) dp[i] = Math.max(dp[i],dp[j] + 1);
            }
        }
        for(int i = 0;i < nums.length;i++){
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}