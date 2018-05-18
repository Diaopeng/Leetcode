最简单的想法
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            int sum = 0;
            for(int j = i + 1;j < nums.length;j++){
                if(nums[j] < nums[i])
                    sum ++;
            }
            result.add(sum);
        }
        return result;
    }
}

TLE



