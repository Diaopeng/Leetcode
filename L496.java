
//采用直接循环解决的方法
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int [] result = new int[findNums.length];
        for(int i = 0;i < findNums.length; i++){
            int pos = 0;
            boolean flag = false;
            for(int j = 0;j < nums.length;j++){
                if(findNums[i] == nums[j])
                    pos = j;
            }
            for(int k = pos+1;k < nums.length;k++){
                if(nums[k] > findNums[i]){
                    result[i] = nums[k];
                    flag = true;
                    break;
                }
            }
            if(!flag) result[i] = -1;
        }
        return result;
    }
}
