
// 为什么说好的返回一个int,最后一定要保证从数组中删除数据

public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;
        int begin = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){ 
                nums[begin] = nums[i];
                begin++;
            }
        }
        return begin;
    }
}
