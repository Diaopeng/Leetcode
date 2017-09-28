class Solution {
    public int maxProfit(int[] prices) {
        int Profit = 0;
        if(prices == null || prices.length == 0) return Profit;
        for(int i = 0;i < prices.length;i++){
            if(i != 0 && prices[i] > prices[i - 1])
                Profit += prices[i] - prices[i -1];
        }
        return Profit;
    }
}
