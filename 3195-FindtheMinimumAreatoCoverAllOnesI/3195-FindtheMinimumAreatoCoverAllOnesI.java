// Last updated: 20/11/2025, 3:09:57 pm
class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length; 
        int left = n; 
        int right = 0;
        int top = m;
        int down = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    top = Math.min(top, i);
                    down = Math.max(down, i);
                    left  = Math.min(left, j);
                    right = Math.max(right, j);
                }
                
            }
        }
        int res = (right-left+1)*(down-top+1);
        return res;

    }
}