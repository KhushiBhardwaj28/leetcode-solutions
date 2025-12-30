// Last updated: 30/12/2025, 12:03:14 pm
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[] in = new int[n+1];
4        int[] out = new int[n+1];
5        for(int[] t: trust){
6            out[t[0]]++;
7            in[t[1]]++;
8
9        }
10        for(int i = 1; i<=n; i++){
11            if(in[i] == n-1 && out[i] == 0){
12                return i;
13            }
14        }
15        return -1;
16    }
17}