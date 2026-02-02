// Last updated: 2/2/2026, 12:27:07 pm
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
13        if(head == null || head.next == null){
14            return null;
15        }
16        ListNode prev = null;
17        ListNode slow = head;
18        ListNode fast = head;
19        while(fast != null && fast.next != null){
20            prev = slow;
21            slow = slow.next;
22            fast = fast.next.next;
23        }
24        prev.next = slow.next;
25        return head;
26    }
27}