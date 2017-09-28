
// 我们加入0 - n然后与原来的数组一起，找到只出现过一次的数字
class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for(int i = 0;i < nums.length;i++){
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }
}
