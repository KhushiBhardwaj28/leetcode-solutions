// Last updated: 6/10/2025, 11:30:42 am
class Solution {
    public int fib(int n) {
        // int a =0, b=1;
        // if(n==0 || n==1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);
        if(n==0 || n==1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}