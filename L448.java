
//本题目是是一道非常清楚的array的题，这里开了O(n)的空间，接下来使用不开额外的空间的方法求解
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        boolean  [] status = new boolean[nums.length + 1];
        for(int i = 0;i < nums.length;i++){
            status[nums[i]] = true;
        }
        for(int i = 1;i <= nums.length;i++){
            if(status[i] == false )
                result.add(i);
        }
        return result;
    }
}

//在这个方法中，我们使用值的正负作为status，然后设置对应的位置的status,虽然我们改变了其他位置上的符号，但是绝对值不变，我们仍然可以使用对应位置绝对值进行计算

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            int iter = Math.abs(nums[i]) - 1;
            if(nums[iter] > 0)
                nums[iter] = -nums[iter];
        }
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0 )
                result.add(i + 1);
        }
        return result;
    }
}
