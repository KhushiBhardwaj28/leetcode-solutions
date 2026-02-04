// Last updated: 4/2/2026, 12:22:08 pm
1class Trie {
2    class Node{
3		char ch;
4		boolean isTerminal;
5		HashMap<Character, Node> child;
6		public Node(char ch) {
7			this.ch= ch;
8			child = new HashMap<>();
9		}
10	}
11	private Node root;
12    public Trie() {
13        root = new Node('*');
14    }
15    
16    public void insert(String word) {
17        Node curr = root;
18		for(int i = 0; i<word.length(); i++) {
19			char ch = word.charAt(i);
20			if(curr.child.containsKey(ch)) {
21				curr = curr.child.get(ch);
22			}else {
23				Node nn = new Node(ch);
24				curr.child.put(ch, nn);
25				curr = nn;
26			}
27		}
28		curr.isTerminal = true;
29    }
30    
31    public boolean search(String word) {
32        Node curr = root;
33		for(int i = 0; i<word.length(); i++) {
34			char ch = word.charAt(i);
35			if(curr.child.containsKey(ch)) {
36				curr = curr.child.get(ch);
37			}else {
38				return false;
39			}
40		}
41		return curr.isTerminal;
42    }
43    
44    public boolean startsWith(String prefix) {
45        Node curr = root;
46		for(int i = 0; i<prefix.length(); i++) {
47			char ch = prefix.charAt(i);
48			if(curr.child.containsKey(ch)) {
49				curr = curr.child.get(ch);
50			}else {
51				return false;
52			}
53		}
54		return true;
55    }
56}
57
58/**
59 * Your Trie object will be instantiated and called as such:
60 * Trie obj = new Trie();
61 * obj.insert(word);
62 * boolean param_2 = obj.search(word);
63 * boolean param_3 = obj.startsWith(prefix);
64 */