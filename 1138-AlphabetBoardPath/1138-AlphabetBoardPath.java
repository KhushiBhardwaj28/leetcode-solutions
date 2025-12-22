// Last updated: 22/12/2025, 2:43:01 pm
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n = s.length();
4        int[] match = new int[n];
5
6        for(int i = 0; i<n; i++){
7            match[i] = -1;
8        }
9        for(int i = 0; i<indices.length; i++){
10            int idx = indices[i];
11            String src = sources[i];
12            if(s.startsWith(src, idx)){
13                match[idx] = i;
14            }
15        }
16        StringBuilder result = new StringBuilder();
17        int i = 0; 
18
19        while(i<n){
20            if(match[i] != -1){
21                int repIdx = match[i];
22                result.append(targets[repIdx]);
23                i+= sources[repIdx].length();
24            }else{
25                result.append(s.charAt(i));
26                i++;
27            }
28        }
29        return result.toString();
30    }
31}