// Last updated: 3/12/2025, 9:48:02 pm
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        int[][] dp = new int[n][m];
6        for(int[] row: dp){
7            Arrays.fill(row,-1);
8
9        }
10        return f(n-1,m-1, nums1, nums2, dp);
11    }
12    public static int f(int idx1, int idx2, int[] s1, int[] s2, int[][] dp){
13        if(idx1<0 || idx2<0) return 0;
14        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
15        if(s1[idx1] == s2[idx2]){
16            return dp[idx1][idx2] = 1+ f(idx1-1, idx2-1, s1, s2, dp);
17        }
18        dp[idx1][idx2] = 0+ Math.max(f(idx1-1, idx2, s1, s2, dp), f(idx1, idx2-1, s1, s2, dp));
19        return dp[idx1][idx2];
20    }
21}