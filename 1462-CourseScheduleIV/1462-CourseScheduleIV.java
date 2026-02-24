// Last updated: 24/2/2026, 11:38:16 am
1class Solution {
2    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
3        List<Boolean> ans = new ArrayList<>();
4        int n = numCourses;
5        boolean[][] arr = new boolean[n][n];
6        for(int i = 0; i<prerequisites.length; i++){
7            int u = prerequisites[i][0];
8            int v = prerequisites[i][1];
9            arr[u][v] = true;
10            
11        }
12        for(int k = 0; k<n; k++){
13            for(int i = 0; i<n; i++){
14                for(int j = 0; j<n; j++){
15                    arr[i][j] |= arr[i][k] && arr[k][j];
16                }
17            }
18        }
19        for(int i = 0; i<queries.length; i++){
20            int u = queries[i][0];
21            int v = queries[i][1];
22            ans.add(arr[u][v]);
23            
24        }
25        return ans;
26    }
27}