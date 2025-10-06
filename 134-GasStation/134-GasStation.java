// Last updated: 6/10/2025, 11:48:21 am
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int zero = climb(dp, 0, cost);
        int first = climb(dp, 1, cost);
        return Math.min(zero, first);
    }
    public static int climb(int[] dp, int i, int[] arr){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int fStair = climb(dp, i+1, arr);
        int sStair = climb(dp, i+2, arr);
        return dp[i] = Math.min(fStair,sStair)+arr[i];
    }
}