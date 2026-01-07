// Last updated: 7/1/2026, 8:06:19 pm
1class Solution {
2    public List<String> getLongestSubsequence(String[] words, int[] groups) {
3        List<String> ans = new ArrayList<>();
4        int lastGroup = -1;
5        for(int i = 0; i<words.length; i++){
6            if(groups[i]!=lastGroup){
7                ans.add(words[i]);
8                lastGroup = groups[i];
9            }
10        }
11        return ans;
12    }
13}