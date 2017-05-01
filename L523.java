/*
这是一个O(n^2)的做法，没有使用动态规划
要注意前面的一些特殊值的判断
*/

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int flag = 0;
        for(int i = 0; i < nums.length; i++){
            flag += nums[i];
        }
        if(nums.length <= 1)
        return false;
        if(k == 0 && flag != 0)
        return false;
        if(k == 0 && flag == 0)
        return true;
        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
                if(sum%k == 0)
                return true;
            }
        }
        return false;
    }
}
/*
题解中使用hashmap和Two Sum的题目一样，存取key-value然后进行判断
*/

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            if(k!=0) sum %= k;
            Integer temp = map.get(sum);
            if(temp != null){
                if(i - temp > 1)
                return true;
            }
            else 
            map.put(sum,i);
        }
        return false;
    }
}