// Last updated: 5/1/2026, 11:46:23 am
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5        int[][] dp = new int[n][m];
6        for(int[] row: dp){
7            Arrays.fill(row, -1);
8        }
9        return f(n-1, m-1, word1,word2, dp);
10    }
11    public static int f(int i, int j, String s1, String s2, int[][] dp){
12        if(i<0){
13            return j+1;
14        }
15        if(j<0) return i+1;
16        if(dp[i][j]!=-1) return dp[i][j];
17        if(s1.charAt(i) == s2.charAt(j)){
18            return dp[i][j] = 0+f(i-1, j-1, s1, s2, dp);
19        }
20        
21            return dp[i][j] = 1+ Math.min(f(i-1, j, s1, s2, dp), Math.min(f(i, j-1, s1, s2, dp), f(i-1, j-1, s1, s2, dp)));
22        
23        
24
25    }
26}