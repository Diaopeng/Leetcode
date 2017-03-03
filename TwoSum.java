package leetcode;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {    //本例中所犯语法错误主要是一：return在返回数组的时候必须和TwoSum方法的位置对应
        HashMap<Integer, Integer> hashtable;         //二：int的数组ans没有分配空间
        hashtable = new HashMap<Integer,  Integer>();
        int [] ans  = new int[2];
        for( int i = 0; i<nums.length; i++){
            int temp = target - nums[i];
            hashtable.put(temp,i);
        }
        for( int i = 0; i<nums.length; i++){
            if(hashtable.containsKey(nums[i])&& i!= hashtable.get(nums[i])){
            	ans[0] = i;
            	ans[1] = hashtable.get(nums[i]);
            	break;
            }
            
        }
        return ans;
    }
}
