// 使用二分搜索，小心(mid + 1 ) ^ 2 超过integer的范围
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int l = 1, r = x / 2;
        while(l <= r){
            int mid = (l + r) / 2;
            if(mid > x / mid)
               r = mid -1;
            else if((mid + 1) <= x /(mid + 1))
                l = mid + 1;
            else 
                return mid;
        }
        return l;
    }
}
