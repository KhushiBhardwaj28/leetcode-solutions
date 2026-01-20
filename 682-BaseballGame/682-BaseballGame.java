// Last updated: 20/1/2026, 2:42:40 pm
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st = new Stack<>();
4        for(String x : operations){
5            if(x.equals("C")){
6                st.pop();
7                
8            }else if(x.equals("D")){
9                st.push(2*st.peek());
10            }else if(x.equals("+")){
11                int last = st.pop();
12                int secondLast = st.peek();
13                st.push(last);
14                st.push(last+secondLast);
15            }else{
16                st.push(Integer.parseInt(x));
17            }
18        }
19        int sum = 0;
20        while(!st.isEmpty()){
21            sum+= st.pop();
22        }
23        return sum;
24    }
25}