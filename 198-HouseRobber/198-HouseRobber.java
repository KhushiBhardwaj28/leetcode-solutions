// Last updated: 12/1/2026, 9:26:24 pm
1class Solution {
2    public int rob(int[] nums) {
3        return f(nums);
4    }
5    public static int f(int[] nums){
6        int[] dp = new int[nums.length+1];
7        dp[0] = nums[0];
8        for(int i = 1; i<nums.length; i++){
9            int pick = nums[i];
10            if(i>1){
11                pick+=dp[i-2];
12            }
13            int notPick = 0+dp[i-1];
14            dp[i] = Math.max(pick, notPick);
15        }
16        return dp[nums.length-1];
17    }
18 }