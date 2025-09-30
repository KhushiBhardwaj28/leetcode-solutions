// Last updated: 30/9/2025, 3:25:42 pm
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}