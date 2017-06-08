/*
枚举排列的变形，刘汝佳的书总结的很好，枚举的下表i应该不重复，不遗漏的取遍所有的P[i]值

*/

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permutation(result, new ArrayList<>(),nums);
        return result;
        
    }
    public void permutation(List<List<Integer>> result, List<Integer> temp, int[] nums){
        if(nums.length == temp.size()){
            result.add(new ArrayList<>(temp));
        }
        else for(int i = 0;i < nums.length;i++){
            int c1 = 0,c2 = 0;
            if(i==0 || nums[i] != nums[i-1]){
                for(int j = 0;j < temp.size();j++) if(nums[i] == temp.get(j)) c1 ++;
                for(int j = 0;j < nums.length;j++) if(nums[i] == nums[j]) c2 ++;
                if(c1 < c2){
                    temp.add(nums[i]);
                    permutation(result, temp,nums);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}