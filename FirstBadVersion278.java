/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/*
   Author: Oliver Gao 
   Complexity: O(lgn)
   status: Accepted
   坑点： 主要在于二分时候的边界判断，防止死循环，可以使用一个1-8的例子自己模拟一下
   在有些比较坑的题目中防止(left+right)可能会爆int
*/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left< right-1){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid;
            }
        }
        if(isBadVersion(left)){
            return left;
        }
        return right;
    }
}