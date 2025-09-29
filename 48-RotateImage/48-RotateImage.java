// Last updated: 29/9/2025, 11:47:22 am
class Solution {
 
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<m; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        //reverse rows
        for(int i = 0; i<n; i++){
                int k = 0;
                int l = m-1;
                while(k<l){
                    int t = matrix[i][k];
                    matrix[i][k] = matrix[i][l];
                    matrix[i][l] = t;
                    k++;
                    l--;
                }
            
        }

    }
}