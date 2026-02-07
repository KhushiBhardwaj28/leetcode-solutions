// Last updated: 7/2/2026, 9:57:31 pm
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        Node node = head;
14        if(head == null) return null; 
15        Stack<Node> st = new Stack<>();
16        while(node != null){
17            if(node.child != null){
18                if(node.next != null){
19                    st.push(node.next);
20                }
21                node.next = node.child;
22                node.child.prev = node;
23                node.child = null;
24            }
25            if(node.next == null && !st.isEmpty()){
26                Node temp = st.pop();
27                node.next = temp;
28                temp.prev = node;
29            }
30            node = node.next;
31        }
32        return head;
33        
34    }
35    
36}