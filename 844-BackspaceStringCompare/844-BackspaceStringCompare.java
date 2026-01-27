// Last updated: 27/1/2026, 2:12:33 pm
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st = new Stack<>();
4        Stack<Character> sb = new Stack<>();
5
6        for(char ch: s.toCharArray()){
7            if(ch == '#'){
8                if(!st.isEmpty()){
9                    st.pop();
10                }else{
11                    continue;
12                }
13            }else{
14                st.push(ch);
15            }
16            
17        }
18        for(char ch: t.toCharArray()){
19            if(ch == '#'){
20                if(!sb.isEmpty()){
21                    sb.pop();
22                }else{
23                    continue;
24                }
25            }else{
26                sb.push(ch);
27            }
28            
29        }
30        if(st.size()!=sb.size()){
31            return false;
32        }
33
34        while(!st.isEmpty() && !sb.isEmpty()){
35                if(st.pop()!=sb.pop()){
36                return false;
37            }
38            
39        }
40        return true;
41    }
42}