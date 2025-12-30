// Last updated: 30/12/2025, 3:41:55 pm
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int n=mat.length;
4        int m=mat[0].length;
5        Queue<int[]> q=new LinkedList<>();
6        int[][] dist=new int[n][m];
7        for(int[] d:dist){
8            Arrays.fill(d,Integer.MAX_VALUE);
9        }
10        for(int i=0;i<n;i++){
11            for(int j=0;j<m;j++){
12                if(mat[i][j]==0){
13                    dist[i][j]=0;
14                    q.add(new int[]{i,j,0});
15                }
16            }
17        }
18        int[] dr={-1,0,0,1};
19        int[] dc={0,-1,1,0};
20        while(!q.isEmpty()){
21            int[] poll=q.poll();
22            int x=poll[0], y=poll[1], di=poll[2];
23            for(int i=0;i<4;i++){
24                int nr=x+dr[i];
25                int nc=y+dc[i];
26                if(nr>=0 && nr<n && nc>=0 && nc<m && mat[nr][nc]==1){
27                    if(dist[nr][nc]>di+1){
28                        dist[nr][nc]=di+1;
29                        q.add(new int[]{nr,nc,di+1});
30                    }
31                }
32            }
33        }
34        return dist;
35    }
36}