// Last updated: 13/1/2026, 3:23:45 pm
1class Solution {
2    public int strStr(String haystack, String needle) {
3        int i = 0;
4       
5        while(i <= haystack.length() - needle.length()){
6            if(needle.equals(haystack.substring(i,i+needle.length()))){
7                return i;
8            }
9            i++;        
10        }
11        return -1;
12    }
13}