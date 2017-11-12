

//题目最终的解法优化到了一次通过
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, total = 0;
        int result = 0;
        for(int i = 0;i < gas.length;i++){
            int temp = gas[i] - cost[i];
            sum += temp;
            total += temp;
            if(sum < 0){
                sum = 0;
                result = i + 1;
            }
        }

        if(total < 0) return -1;
        return result;
    }
}
