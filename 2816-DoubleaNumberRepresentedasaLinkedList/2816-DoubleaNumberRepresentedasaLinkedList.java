// Last updated: 2/2/2026, 3:16:04 pm
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
12    public ListNode doubleIt(ListNode head) {
13        ListNode revHead = reverse(head);
14        ListNode temp = revHead;
15        ListNode prev = null;
16        int carry = 0;
17        while(temp!=null){
18            int value = (temp.val*2)+carry;
19            temp.val = value%10;
20            carry = value/10;
21
22            prev = temp;
23            temp = temp.next;
24            
25        }
26        if(carry>0){
27                prev.next = new ListNode(carry);
28            }
29
30        return reverse(revHead);
31
32
33    }
34    public ListNode reverse(ListNode head){
35        ListNode temp = head;
36        ListNode prev = null;
37        while(temp!=null){
38            ListNode front = temp.next;
39            temp.next = prev;
40            prev = temp;
41            temp = front;
42        }
43        return prev;
44    }
45}