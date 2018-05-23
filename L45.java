//   这个题目仍然使用贪心策略，时间复杂度O(n)
// 
// 

class Solution {
    public int jump(int[] nums) {
        int nextMax = 0;
        int curMax = 0;
        int step = 0;
        for(int i = 0;i < nums.length - 1;i++){
            nextMax = Math.max(nextMax, nums[i]+i);
            if(curMax == i){
                step++;
                curMax = nextMax;
            }
        }
        return step;
    }
}

