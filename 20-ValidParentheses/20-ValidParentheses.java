// Last updated: 19/1/2026, 4:02:37 pm
1class Solution {
2    public boolean checkValidString(String s) {
3        Stack<Integer> open = new Stack<>();
4        Stack<Integer> star = new Stack<>();
5        for(int i = 0; i<s.length(); i++){
6            char c = s.charAt(i);
7            if(c == '('){
8                open.push(i);
9            }else if(c == '*'){
10                star.push(i);
11            }else{
12                if(!open.isEmpty()){
13                    open.pop();
14                }else if(!star.isEmpty()){
15                    star.pop();
16                }else{
17                    return false;
18                }
19            }
20        }
21        while(!open.isEmpty() && !star.isEmpty()){
22            if(open.peek() < star.peek()){
23                open.pop();
24                star.pop();
25            }else{
26                return false;
27            }
28        
29        }
30        return open.isEmpty();
31
32    }
33}