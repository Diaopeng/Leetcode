package leetcode;

import java.util.*;
/*
Status :AC
������ʹ��hash��ķ����������Ӷ�O(n^2)�ı����ⷨ���������O(n)�Ľⷨ
ע�Ȿ���е�if�ж���䣬�Ѿ��ںܶ���Ŀ��Ϊif���ж�˼����ȫ�棬����һֱwa�ˡ�
д������һ��Ҫע������һ�����ݳ�ʼ��  ����if��֧ʱ��������ж�����
*/
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
