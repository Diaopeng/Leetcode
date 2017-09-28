


class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1, right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            int times = 0;
            for(int i = 0;i < nums.length;i++){
                if(nums[i] <= mid)
                    times++;
            }
            if(times > mid)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
