
//简单题，直接hash
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        if(nums == null || nums.length == 0)
            return false;
        for(int n : nums){
            if(!set.add(n)) return true;
        }
        return false;
    }
}
