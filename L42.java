// 这是一个hard题目，使用栈来帮助进行计算，看了题解
public class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        Stack<Integer> s = new Stack<Integer>();
        int Maxwater = 0, water = 0,i = 0;
        while(i < height.length){
            if(s.empty() || height[i] <= height[s.peek()])
                s.push(i++);
            else{
                int temp = s.pop();
                water = s.empty()? 0 : (Math.min(height[i], height[s.peek()]) - height[temp]) *( i - s.peek() - 1);
                Maxwater += water;
            }
        }
        return Maxwater;
    }
}
