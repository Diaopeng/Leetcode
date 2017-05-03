/*
贪心的解法
想法大概就是：随时更新最小值，但是只有在更新过了最大值之后，才能对最终的结果进行更新。
*/

public class Solution {
    public int maxProfit(int[] prices) {
        int buy,result = 0;
        if(prices == null || prices.length == 0)
        return result;
        
        buy = prices[0];
        for(int i = 0;i < prices.length;i++){
            if(prices[i] < buy) 
            buy = prices[i];
            else{
                result = Math.max(result,prices[i] - buy);
            }
        }
        return result;
    }
}