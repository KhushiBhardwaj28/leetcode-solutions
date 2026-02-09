// Last updated: 9/2/2026, 3:47:37 pm
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int m = queries.length;
4        int[] ans = new int[m];
5        for(int i = 0; i<m; i++){
6            ans[i] = cycle(queries[i][0], queries[i][1]);
7        }
8        return ans;
9
10    }
11    public static int cycle(int a, int b){
12        int c = 0;
13        while(a!=b){
14           if(a >b){
15               a = a/2; 
16           }else{
17               b = b/2;
18           }
19           c++;
20        }
21        return c+1;
22    }
23}