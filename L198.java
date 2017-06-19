
//想清楚状态是如何转移的

public class Solution {
    public int rob(int[] nums) {
        int preNo = 0, preYes = 0;
        for( int i = 0; i < nums.length; i++){
            int temp = preNo;
            preNo = Math.max(preNo,preYes);
            preYes = temp + nums[i];
        }
        return Math.max(preNo, preYes);
    }
}
