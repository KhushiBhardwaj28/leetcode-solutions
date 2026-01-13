// Last updated: 13/1/2026, 3:25:18 pm
1class Solution {
2    public int strStr(String haystack, String needle) {
3       
4        for(int i = 0; i <= haystack.length() - needle.length(); i++){
5            if(needle.equals(haystack.substring(i,i+needle.length()))){
6                return i;
7            }
8                   
9        }
10        return -1;
11    }
12}