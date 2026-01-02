// Last updated: 2/1/2026, 11:54:05 am
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if(node == null){
24            return null;
25        }
26        Map<Node, Node> map = new HashMap<>();
27        Queue<Node> q = new LinkedList<>();
28        Node clone = new Node(node.val);
29        map.put(node, clone);
30        q.add(node);
31        while(!q.isEmpty()){
32            Node rv = q.poll();
33            for(Node nbrs: rv.neighbors){
34                if(!map.containsKey(nbrs)){
35                    map.put(nbrs, new Node(nbrs.val));
36                    q.add(nbrs);
37                }
38                map.get(rv).neighbors.add(map.get(nbrs));
39            }
40        }
41        return clone;
42    }
43}