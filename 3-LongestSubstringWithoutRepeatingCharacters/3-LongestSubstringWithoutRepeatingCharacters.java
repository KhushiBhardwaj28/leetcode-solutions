// Last updated: 3/10/2025, 12:45:41 pm
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        while(r<s.length()){
            if(hash[s.charAt(r)]>=l){
                l = Math.max(hash[s.charAt(r)]+1,l);
            }
            int len = r-l+1;
            maxLen = Math.max(len,maxLen);

            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;

    }
}