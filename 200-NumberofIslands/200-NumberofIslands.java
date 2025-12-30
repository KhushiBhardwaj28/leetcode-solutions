// Last updated: 30/12/2025, 11:44:05 am
1class Solution {
2    public int numIslands(char[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int c = 0;
6        for(int i = 0; i<m; i++){
7            for(int j = 0; j<n; j++){
8                if(grid[i][j] == '1'){
9                    c++;
10                    dfs(i,j,grid);
11                }
12            }
13        }
14        return c;
15    }
16    public static void dfs(int i, int j, char[][] grid){
17        int r = grid.length;
18        int c = grid[0].length;
19        if(i<0 || j<0 || i>r-1 || j>c-1|| grid[i][j] == '0'){
20            return;
21        }
22        grid[i][j] = '0';
23        dfs(i+1, j, grid);
24        dfs(i-1, j, grid);
25        dfs(i, j-1, grid);
26        dfs(i, j+1, grid);
27    }
28}