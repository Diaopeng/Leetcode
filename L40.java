/*
注意几点： 
1  这是一个子集生成的问题
2  每个元素不能重复使用
3  给出的数列中有重复元素
*/
public class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        BackTrack(result,new ArrayList<>(), nums, 0, target);
        return result;
    }
    public void BackTrack(List<List<Integer>> result , List<Integer> temp, int [] nums, int start, int remain){
        if(remain < 0) return ;
        else if(remain == 0) result.add(new ArrayList<>(temp));
        else for(int i = start; i < nums.length; i++){
            if(start == i || nums[i] != nums[i-1]){
                temp.add(nums[i]);
                BackTrack(result, temp,nums, i+1, remain - nums[i]);
                temp.remove(temp.size() -1 );
            }
        }
    }
}