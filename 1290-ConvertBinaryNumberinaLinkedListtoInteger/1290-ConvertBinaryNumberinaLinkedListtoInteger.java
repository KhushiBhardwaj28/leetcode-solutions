// Last updated: 2/2/2026, 12:13:33 pm
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
12    public int getDecimalValue(ListNode head) {
13        int res = 0;
14        while(head != null){
15            res = res*2+head.val;
16            head = head.next;
17        }
18        return res;
19    }
20}