/*
这个题目之前错了很多次
O(nlogn)的解法思路主要是先排序，然后把排序后的数字插入的一个新的数组中
但是我之前错了两次，主要是因为在插入的过程中，从0和(nums.length + 1)/2开始插入
或者从0和最后面开始插入，都导致了有一些数据产生了错误，

*/

public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        for(int i = 0;i < (nums.length + 1)/2;++i){
            if((i+(nums.length + 1)/2) < nums.length){
                temp[2*i] = nums[(nums.length + 1)/2 - 1 - i];
                temp[2*i+1] = nums[nums.length - 1 - i];
            }
            if((i+(nums.length + 1)/2) == nums.length){
                temp[2*i] = nums[(nums.length + 1)/2 - 1 - i];
            }
        }
        for( int i = 0;i < nums.length;++i){
            nums[i] = temp[i];
        }
    }
}
//下面是O(n)解法