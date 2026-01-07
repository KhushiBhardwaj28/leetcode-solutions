// Last updated: 7/1/2026, 8:12:23 pm
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4        boolean[] dp = new boolean[n + 1];
5        dp[0] = true;
6        for (int i = 2; i <= n; i++) {
7            if (nums[i - 1] == nums[i - 2]) {
8                dp[i] = dp[i] || dp[i - 2];
9            }
10            if (i >= 3) {
11                if (nums[i - 1] == nums[i - 2] &&
12                    nums[i - 2] == nums[i - 3]) {
13                    dp[i] = dp[i] || dp[i - 3];
14                }
15                if (nums[i - 3] + 1 == nums[i - 2] &&
16                    nums[i - 2] + 1 == nums[i - 1]) {
17                    dp[i] = dp[i] || dp[i - 3];
18                }
19            }
20        }
21
22        return dp[n];
23    }
24}