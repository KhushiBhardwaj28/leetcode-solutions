// Last updated: 31/12/2025, 11:03:53 am
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for(int i= 0; i<n; i++){
5            map.put(i, new ArrayList<>());
6        }
7        for(int i = 0; i<edges.length; i++){
8            int v1 = edges[i][0];
9            int v2 = edges[i][1];
10            map.get(v1).add(v2);
11            map.get(v2).add(v1);
12        }
13        
14
15        Queue<Integer> q =new LinkedList<>();
16        HashSet<Integer> visited = new HashSet<>();
17        q.add(source);
18        while(!q.isEmpty()){
19            int rv = q.poll();
20            if(visited.contains(rv)){
21                continue;
22            }
23            visited.add(rv);
24            if(rv == destination){
25                return true;
26            }
27            for(int nbrs: map.get(rv)){
28                if(!visited.contains(nbrs)){
29                    q.add(nbrs);
30                }
31            }
32        }
33        return false;
34    }
35}