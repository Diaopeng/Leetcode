class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            if((i&1) == 1 && nums[i] < nums[i-1])
                swap(nums, i);
            else if(i != 0 && (i&1) == 0 && nums[i] > nums[i-1])
                swap(nums,i);
        }
    }
    public void swap(int[] nums, int i){
        int temp = nums[i-1];
        nums[i-1] = nums[i];
        nums[i] = temp;
    }
}
