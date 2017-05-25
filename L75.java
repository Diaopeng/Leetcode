/*
该问题的主要的方法是将所有的0全部搬到最左边，将全部的1都搬到最右边。
*/

public class Solution {
    public void sortColors(int[] nums) {
        int begin = 0, end = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] == 2 && i < end) {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                --end;
            }
            while(nums[i] == 0 && i > begin) {
                int temp = nums[i];
                nums[i] = nums[begin];
                nums[begin] = temp;
                ++begin;
            }
        }
    }
}