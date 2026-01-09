// Last updated: 9/1/2026, 8:38:58 pm
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        int maxSide = 0;
6        int[][] dp = new int[n][m];
7        for(int i =n-1; i>=0; i--){
8            for(int j = m-1; j>=0; j--){
9                if(matrix[i][j] == '1'){
10                    if (i == n - 1 || j == m - 1) {
11                        dp[i][j] = 1;
12                    }else{
13dp[i][j] = 1+ Math.min(dp[i+1][j], Math.min(dp[i+1][j+1], dp[i][j+1]));
14                    }
15                    
16                }
17                maxSide = Math.max(maxSide, dp[i][j]);
18            }
19        }
20        return maxSide*maxSide;
21    }
22}