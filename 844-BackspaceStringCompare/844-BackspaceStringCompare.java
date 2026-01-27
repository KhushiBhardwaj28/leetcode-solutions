// Last updated: 27/1/2026, 3:26:45 pm
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for(int i = nums2.length-1; i>=0; i--){
6            while(!st.isEmpty() && nums2[i]>st.peek()){
7                st.pop();
8
9            }
10            if(st.isEmpty()){
11                map.put(nums2[i], -1);
12            } 
13            else{
14                map.put(nums2[i], st.peek());
15            }
16            st.push(nums2[i]);
17        }
18        for(int i = 0; i<nums1.length; i++){
19            if(map.containsKey(nums1[i])){
20                nums1[i] = map.get(nums1[i]);
21            }
22        }
23        return nums1;
24
25    }
26}