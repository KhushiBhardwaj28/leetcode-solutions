// Last updated: 20/1/2026, 3:38:13 pm
1class Solution {
2    public String removeOuterParentheses(String s) {
3        int count = 0;
4        StringBuilder sb = new StringBuilder();
5        for(char c: s.toCharArray()){
6            if(c == '('){
7                if(count>0){
8                    sb.append(c);
9                }
10                count++;
11            }else{
12                count--;
13                if(count>0){
14                    sb.append(c);
15                }
16                 
17            }
18           
19            
20        }
21        return sb.toString();
22
23
24    }
25}