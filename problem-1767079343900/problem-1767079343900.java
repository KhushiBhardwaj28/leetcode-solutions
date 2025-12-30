// Last updated: 30/12/2025, 12:52:23 pm
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3
4        HashMap<Integer, List<Integer>> map = new HashMap<>();
5        int n = isConnected.length;
6        int c = 0;
7        for (int i = 0; i < n; i++) {
8            map.put(i, new ArrayList<>());
9            for (int j = 0; j < n; j++) {
10                if (isConnected[i][j] == 1 && i != j) {
11                    map.get(i).add(j);
12                }
13            }
14        }
15        Queue<Integer> q = new LinkedList<>();
16        HashSet<Integer> visited = new HashSet<>();
17        for(int key: map.keySet()){
18            if(visited.contains(key)){
19                continue;
20            }
21            q.add(key);
22            c++;
23            while(!q.isEmpty()){
24                int rv = q.poll();
25                if(visited.contains(rv)){
26                    continue;
27                }
28                visited.add(rv);
29                for(int nbrs: map.get(rv)){
30                    if(!visited.contains(nbrs)){
31                        q.add(nbrs);
32                    }
33                }
34
35            }
36            
37        }
38        return c;
39    }
40}
41
42    
43