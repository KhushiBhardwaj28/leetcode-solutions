// Last updated: 4/2/2026, 3:37:47 pm
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> l = new ArrayList<>();
14        ListNode temp = head;
15        while(temp!= null){
16            l.add(temp.val);
17            temp = temp.next;
18        }
19        int n = l.size();
20        int[] ans = new int[n];
21        Stack<Integer> st = new Stack<>();
22        for(int i = 0; i<n; i++){
23            while(!st.isEmpty() && l.get(i)>l.get(st.peek())){
24                int idx = st.pop();
25                ans[idx] = l.get(i);
26            }
27            st.push(i);
28        }
29        return ans;
30    }
31}