package leetcode;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {    //�����������﷨������Ҫ��һ��return�ڷ��������ʱ������TwoSum������λ�ö�Ӧ
        HashMap<Integer, Integer> hashtable;         //����int������ansû�з���ռ�
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
