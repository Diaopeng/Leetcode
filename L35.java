//二分查找


public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0)
        return 0;
        int left = 0, right = nums.length - 1,mid = 0;
        boolean flag = true;
        while(left <= right){
            mid = (left + right)/2;
            if(nums[mid] == target)   return mid;
            if(nums[mid] > target) {
                right = mid - 1;
                flag = true;
            }
            else{
                left = mid + 1;
                flag = false;
            }
        }
        if(flag) return right + 1;
        else return left;
    }
}