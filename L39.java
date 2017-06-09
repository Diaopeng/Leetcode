/*
这是一个排列的问题的变形，可以重复最开始的值，但是(1,2,3)和(3,2,1)仍然算作一种解法
*/

public class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        BackTrack(result,new ArrayList<>(), nums, 0, target);
        return result;
    }
    public void BackTrack(List<List<Integer>> result , List<Integer> temp, int [] nums, int start, int remain){
        if(remain < 0) return ;
        else if(remain == 0) result.add(new ArrayList<>(temp));
        else for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            BackTrack(result, temp,nums, i, remain - nums[i]);
            temp.remove(temp.size() -1 );
        }
    }
}