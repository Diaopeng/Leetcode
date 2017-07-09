//这个题目和448类似，首先仍然是使用space complexity O(n)的方式得出解，接下来我们对该方法进行优化
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean [] status = new boolean[nums.length + 1];
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            if(status[nums[i]] == true)
                result.add(nums[i]);
            else
                status[nums[i]] = true;
                
        }
        return result;
    }
}
//和448类似
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            int iter = Math.abs(nums[i]) - 1;
            if(nums[iter] < 0)
                result.add(Math.abs(nums[i]));
            else
                nums[iter] = -nums[iter];
                
        }
        return result;
    }
}
