// Last updated: 10/3/2026, 3:53:33 pm
1class Solution {
2    int[][] dir={{1,2},{-1,2},{1,-2},{-1,-2},{2,1},{-2,1},{2,-1},{-2,-1}};
3    public double knightProbability(int n, int k, int row, int column) {
4        double[][][] dp=new double[n][n][k+1];
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                Arrays.fill(dp[i][j], -1.0);
8            }
9        }
10        return helper(row,column,n,dp,k);
11    }
12    public double helper( int r,int c,int n,double[][][] dp,int moves){
13        if(r<0 || c<0 ||r>=n || c>=n){
14            return 0.0;
15        }
16        if(moves==0){
17            return 1.0;
18        }
19        if(dp[r][c][moves]!=-1.0){
20            return dp[r][c][moves];
21        }
22        double prob=0;
23        for(int i=0;i<8;i++){
24            int nrow=r+dir[i][0];
25            int ncol=c+dir[i][1];
26            prob+=helper(nrow,ncol,n,dp,moves-1)/8.0;
27        }
28        return dp[r][c][moves]=prob;
29    }
30}