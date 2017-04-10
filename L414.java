
/*
本题目先找到最大值，然后依次找其他的值;
注意边界控制
*/

public class Solution {
    public int thirdMax(int[] nums) {
        int result[] = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        int flag = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > result[0]){
                result[0] = nums[i];
            }
        }
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > result[1] && nums[i] < result[0]){
                result[1] = nums[i];
            }
        }
        for(int i = 0;i < nums.length; i++){
            if(nums[i] >= result[2] && nums[i] < result[1]){
                result[2] = nums[i];
                flag = 1;
            }
        }
        if(flag == 0 ){
            return result[0];
        }
        return result[2];
    }
}
