/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/*
注意边界控制的方法，一种就是先验证两端的值
    第二种方法：可以left = mid +1  right = mid - 1
*/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left< right-1){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid;
            }
        }
        if(isBadVersion(left)){
            return left;
        }
        return right;
    }
}