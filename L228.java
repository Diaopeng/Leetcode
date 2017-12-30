//这个题目为了控制边界情况付出了写了很多重复的代码
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        int start = 0;
        if(nums.length == 1) result.add(String.valueOf(nums[0]));
        for(int i = 1;i < nums.length;i++){
            if(nums[i] - nums[i-1] != 1){
                if(i - start == 1){
                    result.add(String.valueOf(nums[start]));
                    start = i;
                }
                else{
                    String s = String.valueOf(nums[start]) + "->" + String.valueOf(nums[i-1]);
                    result.add(s);
                    start = i;
                }
                    
            }
            if(i == nums.length - 1){
                if(i == start){
                    result.add(String.valueOf(nums[start]));
                }
                else{
                    String s = String.valueOf(nums[start]) + "->" + String.valueOf(nums[i]);
                    result.add(s);
                }
            }
        }
        return result;
    }
}
