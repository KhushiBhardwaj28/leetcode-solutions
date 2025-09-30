// Last updated: 30/9/2025, 11:08:09 am
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        if(m*n!= len){
            return new int[0][0];
        }
        int[][] ans = new int[m][n];
        int idx = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                ans[i][j] = original[idx];
                idx++;
            }
        }
        return ans;
    }
}