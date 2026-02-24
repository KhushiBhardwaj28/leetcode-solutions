// Last updated: 24/2/2026, 3:59:52 pm
1class Solution {
2    class Pair {
3        int node;
4        long time;
5
6        Pair(int nd, long tm) {
7            this.node = nd;
8            this.time = tm;
9        }
10
11    }
12
13    int mod = 1000000007;
14
15    public int countPaths(int n, int[][] roads) {
16        List<List<Pair>> adj = new ArrayList<>();
17        for (int i = 0; i < n; ++i) {
18            adj.add(new ArrayList<>());
19        }
20        for (int[] r : roads) {
21            int u = r[0];
22            int v = r[1];
23            int t = r[2];
24            adj.get(u).add(new Pair(v, (long) t));
25            adj.get(v).add(new Pair(u, (long) t));
26        }
27        long[] dist = new long[n];
28        long[] ways = new long[n];
29        ways[0] = 1;
30        Arrays.fill(dist, Long.MAX_VALUE);
31        dist[0] = 0;
32
33        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
34            @Override
35            public int compare(Pair p1, Pair p2) {
36                return Long.compare(p1.time, p2.time);
37            }
38        });
39        pq.offer(new Pair(0, 0));
40
41        while (!pq.isEmpty()) {
42            Pair arr = pq.poll();
43            int curr = arr.node;
44            long tm = arr.time;
45            if (tm > dist[curr])
46                continue;
47            for (Pair a : adj.get(curr)) {
48                int neigh = a.node;
49                long ndtm = a.time;
50                if (ndtm + tm < dist[neigh]) {
51                    dist[neigh] = ndtm + tm;
52                    ways[neigh] = ways[curr] % mod;
53                    pq.offer(new Pair(neigh, dist[neigh]));
54                } else if (ndtm + tm == dist[neigh]) {
55                    ways[neigh] = (ways[neigh] + ways[curr]) % mod;
56                }
57            }
58        }
59        return (int) ways[n - 1] % mod;
60    }
61}