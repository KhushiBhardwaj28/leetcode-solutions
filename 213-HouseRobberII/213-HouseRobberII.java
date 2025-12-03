// Last updated: 3/12/2025, 10:44:20 pm
1class Solution {
2    public int numDistinct(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        long[][] dp = new long[n+1][m+1];
6
7        for (int i = 0; i <= n; i++) dp[i][0] = 1;
8
9        for (int i = 1; i <= n; i++) {
10            for (int j = 1; j <= m; j++) {
11                if (s.charAt(i-1) == t.charAt(j-1)) {
12                    
13                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
14                } else {
15                    
16                    dp[i][j] = dp[i-1][j];
17                }
18            }
19        }
20
21        
22        return (int) dp[n][m];
23    }
24     
25}