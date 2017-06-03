/*
暴力枚举，算法竞赛的书上面有
*/
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(result, new ArrayList<>(),nums);
        return result;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> temp,int[] nums){
        if(nums.length == temp.size()){
            list.add(new ArrayList<>(temp));
        }
        else for(int i = 0;i < nums.length;i++){
            boolean ok = true;
            for(int j = 0;j < temp.size();j++){
                if(nums[i] == temp.get(j))  ok = false;
            }
            if(ok) {
                temp.add(nums[i]);
                backtrack(list, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}