
//类似three sum的思路直接解题
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0;i < nums.length - 2;i++){
            int begin = i + 1, end = nums.length - 1, newtarget = target - nums[i];
            while(begin < end){
                if(nums[begin] + nums[end] < newtarget ){
                    result += (end - begin);
                    begin++;
                }
                else
                    end--;
            }
        }
        return result;
    }
}
