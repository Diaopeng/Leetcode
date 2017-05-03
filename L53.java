/*
这道题目和Maximum Product Subarray非常像，dp[i] = max(dp[i-1],nums[i]) (1)
界定连续的子串的起始，方程1保证可以找到正确的子串的开始，result可以保证找到正确的结束的位置
*/

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], result = nums[0];
        if(nums.length == 1){
            return result;
        }
        for(int i = 1;i < nums.length;i++){
            max = Math.max(nums[i],max + nums[i]);
            result = Math.max(result,max);
        }
        return result;
    }
}