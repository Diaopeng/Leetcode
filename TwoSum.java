package leetcode;

import java.util.*;
/*
Status :AC
本题中使用hash表的方法，将复杂度O(n^2)的暴力解法，化解沉了O(n)的解法
注意本题中的if判断语句，已经在很多题目因为if的判断思考不全面，导致一直wa了。
写程序是一定要注意两点一：数据初始化  二：if分支时候想清楚判断条件
*/
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


//可以使用更好的方法省去一次扫描的复杂度，并且不用在去防止出现8-4 = 4这种情况，即上衣中方法中if(i!=hashtable.get(nums[i]))的情况
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                result[0] = i;
                result[1] = hash.get(nums[i]);
                return result;
            }
            hash.put(target - nums[i], i);
        }
        return result;
    }
}
