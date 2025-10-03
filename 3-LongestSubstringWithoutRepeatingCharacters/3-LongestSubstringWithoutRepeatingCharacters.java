// Last updated: 3/10/2025, 12:48:58 pm
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        while(r<s.length()){
            if(hash[s.charAt(r)]>=l){
                l =hash[s.charAt(r)]+1;
            }
            int len = r-l+1;
            maxLen = Math.max(len,maxLen);

            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;

    }
}