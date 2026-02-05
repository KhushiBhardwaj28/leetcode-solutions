// Last updated: 5/2/2026, 12:16:49 pm
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3        //build trie of dictionary and returns its terminal
4        Trie t=new Trie();
5        for(String st:dictionary){
6            t.insert(st);
7        }
8        String[] ar=sentence.split(" ");
9        StringBuilder sb=new StringBuilder();
10        for(int i=0;i<ar.length;i++){
11            String get=t.search(ar[i]);
12            sb.append(get+" ");
13        }
14        return(sb.toString().trim());
15    }
16     static class Trie{
17        class Node{
18        char ch;
19        String  isterminal;
20        HashMap<Character, Node> child;
21            public Node(char ch){
22                this.ch=ch;
23                child=new HashMap<>();
24            }
25        }
26        private Node root;
27        public Trie() {
28            root=new Node('*');
29        } 
30        public void insert(String word){
31            Node curr=root;
32            for(int i=0;i<word.length();i++){
33                char ch=word.charAt(i);
34                if(curr.child.containsKey(ch)){
35                    curr=curr.child.get(ch);
36                }
37                else{
38                    Node nn=new Node(ch);
39                    curr.child.put(ch,nn);
40                    curr=nn;
41                }
42            }
43            curr.isterminal=word;
44        }
45        public String search(String word){
46            Node curr=root;
47            for(int i=0;i<word.length();i++){
48                char ch=word.charAt(i);
49                if(curr.child.containsKey(ch)){
50                    curr=curr.child.get(ch);
51                    if(curr.isterminal!=null){
52                        return curr.isterminal;
53                    }
54                }
55                else return word;
56            }
57            return word;
58        }
59    }
60    
61}