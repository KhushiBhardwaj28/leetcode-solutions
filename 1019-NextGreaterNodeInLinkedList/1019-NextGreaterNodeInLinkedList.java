// Last updated: 4/2/2026, 3:08:21 pm
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
13        ListNode curr = head;
14        int n = len(head);
15        int[] arr = new int[n];
16        int i = 0;
17        while(curr!=null){
18            ListNode temp = curr.next;
19            int ans = 0;
20            while(temp!=null){
21                if(curr.val<temp.val){
22                    ans = temp.val;
23                    
24                    break;
25                }
26                temp = temp.next;
27                
28            }
29            arr[i] = ans;
30            i++;
31            curr = curr.next;
32        }
33        
34        return arr;
35
36    }
37    public int len(ListNode head){
38        ListNode temp = head;
39        int c = 0;
40        while(temp!=null){
41            temp = temp.next;
42            c++;
43        }
44        return c;
45    }
46}