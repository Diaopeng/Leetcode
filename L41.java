//自己写swap的时候注意交换的顺序，不能先更改nums[i] 否则会造成数组越界
class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            while(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        int i = 0;
        for( ;i < nums.length;i++){
            if(i != nums[i] - 1)
                return i+1;
        }
        return i+1;
    }
}
