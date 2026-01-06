// Last updated: 6/1/2026, 7:25:32 am
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ans = new  ArrayList<>();
4        generatefunc(0, 0, n, "", ans);
5        return ans;
6    }
7    public static void generatefunc(int open, int close, int n, String s, List<String> ans){
8        if(open>n) return;
9        if(open+close == 2*n && open == close){
10            ans.add(s);
11            return;
12        }
13        generatefunc(open+1,close,n, s+"(", ans);
14        if(close<open){
15            generatefunc(open,close+1,n, s+")", ans);
16        }
17    }
18}