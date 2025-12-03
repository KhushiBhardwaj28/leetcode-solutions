// Last updated: 3/12/2025, 5:48:33 pm
1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length == 0) return 0;
4        if(nums.length == 1) return nums[0];
5        if (nums.length == 2) return Math.max(nums[0], nums[1]);
6        int[] temp1 = new int[nums.length-1];
7        int[] temp2 =new int[nums.length-1];
8        for(int i = 0; i<nums.length; i++){
9            if(i!=0) temp1[i-1] = nums[i];
10            if(i!=nums.length-1) temp2[i] = nums[i];
11        } 
12        return Math.max(f(temp1), f(temp2));
13    }
14    public static int f(int[] nums){
15         int n = nums.length;
16    if (n == 0) return 0;
17    if (n == 1) return nums[0];
18        int[] dp = new int[nums.length];
19        dp[0] = nums[0];
20        dp[1] = Math.max(nums[0], nums[1]);
21        for(int i = 2; i<nums.length; i++){
22            int pick = nums[i] + dp[i-2];
23            
24            int notPick = 0+dp[i-1];
25            dp[i] = Math.max(pick, notPick);
26
27        }
28        return dp[nums.length-1];
29    }
30}