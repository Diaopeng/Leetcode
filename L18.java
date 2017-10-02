
// 这个题目中使用的类似3sum的解法，算法的复杂度O(n^3)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 3;i++){
            if(i != 0 && nums[i] == nums[i -1 ]) continue;
            for(int j = i + 1;j < nums.length - 1;j++){
                if(j != i + 1 && nums[j] == nums[j -1]) continue;
                if(nums[i] + nums[j] > target && nums[j] > 0) break;
                int start = j + 1, end = nums.length - 1, newtarget = target - nums[i] - nums[j];
                while(start < end){
                    if(nums[start] + nums[end] == newtarget ){
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while(start < end && nums[start] == nums[start + 1]) start++;
                        while(start < end && nums[end] == nums[end - 1]) end--;
                        start++; end--;
                    }
                    else if(nums[start] + nums[end] > newtarget)
                        end--;
                    else
                        start++;
                }
                
            }
        }
        return result;
    }
}
