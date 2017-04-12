/*
这道题现在我可以使用最容易想到的O(n)复杂度的解法去解，应该还可以找到更好的方法
*/




public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
        return 0;
        if(nums[0] > nums[1])
        return 0;
        if(nums[nums.length-1] > nums[nums.length-2])
        return nums.length-1;
        int result = 0;
        for(int i = 1;i < nums.length - 1; i++){
            if(nums[i] > nums[i+1] && nums[i] > nums[i-1]){
                result = i;
                break;
            }
        }
        return result;
    }
}
