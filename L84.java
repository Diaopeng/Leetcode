class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0;i <= heights.length;i++){
            int h = (i == heights.length? 0:heights[i]);
            if(s.empty() || h >= heights[s.peek()]){
                s.push(i);
            }
            else{
                int index = s.pop();
                maxArea = Math.max(maxArea, heights[index] * (s.empty()? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
