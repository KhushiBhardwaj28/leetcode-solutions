// Last updated: 13/1/2026, 2:37:28 pm
1class Solution {
2    public int maxProfit(int[] prices) {
3        int mini = Integer.MAX_VALUE;
4        int maxP = 0;
5        for(int price: prices){
6            if(price<mini){
7                mini = price;
8            }
9            else{
10                maxP = Math.max(maxP, price-mini);
11            }
12        }
13        return maxP;
14    }
15}