// Last updated: 22/12/2025, 2:12:35 pm
1class Solution {
2    public String longestNiceSubstring(String s) {
3        if(s.length()<2){
4            return "";
5        }
6        Set<Character> set = new HashSet<>();
7        for(char c: s.toCharArray()){
8            set.add(c);
9        }
10        for(int i = 0; i<s.length(); i++){
11            char c = s.charAt(i);
12            if(!s.contains(String.valueOf(Character.toLowerCase(c))) || !s.contains(String.valueOf(Character.toUpperCase(c)))
13){
14                String l = longestNiceSubstring(s.substring(0, i));
15                String r = longestNiceSubstring(s.substring(i+1));
16                if(l.length()>=r.length()){
17                return l;
18            }else{
19                return r;
20            }
21            }
22            
23        }
24        return s;
25    }
26}