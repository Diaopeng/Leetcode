//使用双指针的方法求得最小值

public class Solution {
    public int maxArea(int[] height) {
        int Max = 0,  l = 0, r = height.length - 1;
        while(l < r){
            Max = Math.max(Max, Math.min(height[l],height[r]) * (r - l));
            if(height[r] > height[l])
                l++;
            else 
                r--;
        }
        return Max;
    }
}
