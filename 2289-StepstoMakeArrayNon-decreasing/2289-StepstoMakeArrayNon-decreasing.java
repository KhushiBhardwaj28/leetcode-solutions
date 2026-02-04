// Last updated: 4/2/2026, 3:45:41 pm
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> st = new Stack<>();
4        
5        int max_c = 0;
6        for(int i = nums.length-1; i>=0; i-- ){
7            int c = 0;
8            while(!st.isEmpty() && nums[st.peek()[0]]<nums[i]){
9                int[] a = st.pop();
10                c++;
11                c = Math.max(c, a[1]);
12            }
13            max_c = Math.max(max_c,c);
14            st.push(new int[]{i, c});
15        }
16        return max_c;
17
18    }
19}