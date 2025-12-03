// Last updated: 3/12/2025, 6:06:25 pm
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int[] dp = new int[cost.length];
4        dp[0] = cost[0];
5        dp[1] = cost[1];
6        for(int i = 2; i<cost.length; i++){
7            int first = cost[i]+dp[i-1];
8            int second = cost[i]+dp[i-2];
9            dp[i] = Math.min(first, second);
10        }
11        return Math.min(dp[cost.length-2],dp[cost.length-1]);
12    }
13}