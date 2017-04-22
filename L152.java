
/*
使用动态规划的方法，我只想到了使用a[i] = max(a[i-1] * nums[i], nums[i])
但是这样无法解决连续乘两个负数可以得到最大值的情况
考虑到了保存最小值
*/

public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int max = nums[0],min = nums[0];
        int glo_max = nums[0];
        for(int i = 1;i < nums.length;i++){
            int temp_max = max;
            max = Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
            min = Math.min(nums[i],Math.min(temp_max*nums[i],min*nums[i]));
            glo_max = Math.max(glo_max,max);
        }
        return glo_max;
    }
}
