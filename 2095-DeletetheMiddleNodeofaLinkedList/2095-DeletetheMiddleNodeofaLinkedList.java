// Last updated: 2/2/2026, 12:23:56 pm
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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head.next == null){
14            return null;
15        }
16        int c = 0;
17        
18        ListNode temp = head;
19        while(temp != null){
20            temp = temp.next;
21            c++;
22        }
23        int mid = c/2;
24        int count = 0;
25        ListNode prev = head;
26        while(count<mid-1){
27            prev = prev.next;
28            count++;
29        }
30        prev.next = prev.next.next;
31        
32
33        return head;
34
35    }
36}