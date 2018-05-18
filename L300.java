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

//这个问题的优化方法主要是使用tail[i]来表示当长度为i + 1的时候，该长度的增长序列的最小的末尾值
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = 0;
        int [] tail = new int[nums.length];
        for(int num: nums){
            int i = Arrays.binarySearch(tail, 0,len,num);
            if(i < 0)
                i = -(i + 1);
            tail[i] = num;
            if(len == i) len++;
        }
        return len;
    }
}
