
//我的解法， 关注点放在0上面，只要能跨过0,就可以到达终点
class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0] == 0 && nums.length == 1) return true;
        if(nums[0] == 0) return false;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 0){
                boolean flag = false;
                int cur  = i - 1;
                while(cur >= 0){
                    if(nums[cur] + cur > i || ((nums[cur] + cur) == nums.length - 1) ){
                        flag = true;
                        break;
                    }
                    cur--;
                }
                if(!flag) return false;
            }
        }
        return true;
    }
}


class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0;i < nums.length; i++){
            if(i > max) return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}
