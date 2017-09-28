

//  leetcode简单题， 使用^操作
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0;i < nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
