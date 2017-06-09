
/*
注意退出时候的一定要把LIST尾部的元素弹出来
*/

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Sub(result, new ArrayList<>(),nums,0);
        return result;
    }
    public void Sub(List<List<Integer>> result ,List<Integer> temp, int[] nums,int n){
        result.add(new ArrayList<> (temp));
        for(int i = n; i < nums.length; i++){
            temp.add(nums[i]);
            Sub(result, temp, nums,i + 1);
            temp.remove(temp.size() -1);
        }
    }
}